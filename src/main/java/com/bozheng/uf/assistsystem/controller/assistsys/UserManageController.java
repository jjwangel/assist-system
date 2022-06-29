package com.bozheng.uf.assistsystem.controller.assistsys;

import cn.dev33.satoken.SaTokenManager;
import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.bozheng.uf.assistsystem.annotation.VerifyLogin;
import com.bozheng.uf.assistsystem.constants.RedisConstant;
import com.bozheng.uf.assistsystem.constants.assistsys.UserConstant;
import com.bozheng.uf.assistsystem.converter.assistsys.EntityToVoConverter;
import com.bozheng.uf.assistsystem.domain.entity.assistsys.SysUser;
import com.bozheng.uf.assistsystem.domain.entity.ufsystem.UaUser;
import com.bozheng.uf.assistsystem.domain.dto.ufsystem.LoginAccountInfoDto;
import com.bozheng.uf.assistsystem.domain.vo.ResultPageVo;
import com.bozheng.uf.assistsystem.domain.vo.ResultVo;
import com.bozheng.uf.assistsystem.domain.vo.request.assistsys.LoginInfoVo;
import com.bozheng.uf.assistsystem.domain.vo.request.assistsys.SysUserQueryVo;
import com.bozheng.uf.assistsystem.domain.vo.response.assistsys.SyncSysUserVo;
import com.bozheng.uf.assistsystem.domain.vo.response.assistsys.SysUserVo;
import com.bozheng.uf.assistsystem.enums.result.ResultEnum;
import com.bozheng.uf.assistsystem.exception.ValidateFieldException;
import com.bozheng.uf.assistsystem.service.assistsys.SysUserService;
import com.bozheng.uf.assistsystem.service.ufsystem.AccountInfoService;
import com.bozheng.uf.assistsystem.service.ufsystem.UserService;
import com.bozheng.uf.assistsystem.utils.*;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author jianjiawen
 * @date 2021-2-20 20:15
 */
@Api(tags = "AssistSys-用户管理")
@RestController
@RequestMapping("/users")
@Slf4j
public class UserManageController {

    private StringRedisTemplate redisTemplate;
    private AccountInfoService accountInfoService;
    private SysUserService sysUserService;
    private UserService ufUserService;

    @Autowired
    private void setRedisTemplate(StringRedisTemplate redisTemplate) {
        this.redisTemplate=redisTemplate;
    }

    @Autowired
    private void setAccountInfoService(AccountInfoService accountInfoService) {
        this.accountInfoService=accountInfoService;
    }

    @Autowired
    private void setSysUserService(SysUserService sysUserService) {
        this.sysUserService = sysUserService;
    }

    @Autowired
    private void setUfUserService(UserService userService) {
        this.ufUserService = userService;
    }

    @ApiOperationSupport(author = "jianjiawen")
    @ApiResponse(code=200,message = "返回ResultVo对像")
    @ApiOperation(value = "用户登录")
    @PostMapping("/login")
    public ResultVo<SysUserVo> login(@RequestBody @Valid LoginInfoVo loginInfoVo, BindingResult bindingResult) throws InstantiationException, IllegalAccessException {

        if (bindingResult.hasErrors()) {
            throw new ValidateFieldException(ResultEnum.VALIDATE_ERROR, bindingResult.getAllErrors().get(0).getDefaultMessage());
        }

        //1.检验用户登录信息并返回用户相关数据
        SysUser sysUser = this.sysUserService.login(loginInfoVo.getLoginId(), loginInfoVo.getLoginPwd());

        //2.跟据登录所选账号套与账套日期获取账套数据
        LoginAccountInfoDto loginAccountInfoDto = this.accountInfoService
                .findLoginAccountInfo(loginInfoVo.getAccId(), DateUtil.parse(loginInfoVo.getAccDate()));

        //2.设置token并保存用户信息至redis
        StpUtil.setLoginId(loginInfoVo.getLoginId());

        int expire = (int) SaTokenManager.getConfig().getActivityTimeout();
        String token = StpUtil.getTokenValue();

        this.redisTemplate.opsForValue().set(String.format(RedisConstant.TOKEN_PREFIX, token),
                JSONUtil.parse(loginAccountInfoDto).toString(), expire, TimeUnit.SECONDS);

        SysUserVo resultVo = EntityToVoConverter.toVo(sysUser, SysUserVo.class);

        return ResultVoUtil.success(resultVo);
    }

    @ApiOperationSupport(author = "jianjiawen")
    @ApiResponse(code=200,message = "返回ResultVo对像")
    @ApiOperation(value = "用户登出")
    @GetMapping("/logout")
    public ResultVo<Object> logOut(){

        //1.清除redis的token
        if (!StrUtil.isEmpty(StpUtil.getTokenValue())) {
            this.redisTemplate.opsForValue().getOperations().delete(String.format(RedisConstant.TOKEN_PREFIX, StpUtil.getTokenValue()));
        }

        //2.登出
        StpUtil.logout();
        return ResultVoUtil.success();
    }

    @VerifyLogin
    @ApiOperationSupport(author = "jianjiawen")
    @ApiResponse(code=200,message = "返回ResultVo对像")
    @ApiOperation(value = "同步用友用户")
    @PostMapping("/synchronous")
    public ResultVo<SyncSysUserVo> syncUserFromUf() {

        QueryWrapper<UaUser> qwUser = new QueryWrapper<>();
        // 排除admin用户
        qwUser.ne("cUser_Id", "admin");
        List<UaUser> lstSource = this.ufUserService.list(qwUser);
        SyncSysUserVo syncSysUserVo = this.sysUserService.syncSysUserFromUf(lstSource);

        return ResultVoUtil.success(syncSysUserVo);
    }

    @VerifyLogin
    @ApiOperationSupport(author = "jianjiawen")
    @ApiResponse(code = 200, message = "返回ResultVo对像")
    @ApiOperation(value = "获取用户列表数据")
    @GetMapping("/sysuser/page")
    public ResultVo<ResultPageVo<SysUserVo>> findSysUser(SysUserQueryVo sysUserQueryVo) throws IllegalAccessException, InstantiationException {

        BuildQueryWrapper<SysUser> buildQueryWrapper = new BuildQueryWrapper<>();

        QueryWrapper<SysUser> queryWrapper = buildQueryWrapper.buildQw(sysUserQueryVo);
        // 额外条件
        // 排除管理员
        queryWrapper.ne("login_id", "admin");

        IPage<SysUser> pageInst = this.sysUserService.findSysUserByPage(sysUserQueryVo.getPage(), sysUserQueryVo.getSize(), queryWrapper);
        ResultPageVo<SysUserVo> resultPageVo = new ResultPageVo<>();
        resultPageVo.setPageCount(pageInst.getPages());
        resultPageVo.setCurrentPage(pageInst.getCurrent());
        resultPageVo.setSize(pageInst.getSize());
        resultPageVo.setRecordCount(pageInst.getTotal());
        resultPageVo.setRecords(EntityToVoConverter.toVo(pageInst.getRecords(), SysUserVo.class));
        return ResultVoUtil.success(resultPageVo);
    }

    @VerifyLogin
    @ApiOperationSupport(author = "jianjiawen")
    @ApiResponse(code = 200, message = "返回ResultVo对像")
    @ApiOperation(value = "删除用户")
    @DeleteMapping("/sysuser")
    public ResultVo deleteSysUser(@RequestParam("id") List<Long> lstId){
        this.sysUserService.removeByIds(lstId);
        return ResultVoUtil.success();
    }

    @VerifyLogin
    @ApiOperationSupport(author = "jianjiawen")
    @ApiResponse(code = 200, message = "返回ResultVo对像")
    @ApiOperation(value = "恢复用户")
    @PutMapping("/sysuser/restore")
    public ResultVo restoreSysUser(@RequestParam("id") List<Long> lstId) {
        this.sysUserService.restoreSysUser(lstId);
        return ResultVoUtil.success();
    }

    @VerifyLogin
    @ApiOperationSupport(author = "jianjiawen")
    @ApiResponse(code = 200, message = "返回ResultVo对像")
    @ApiOperation(value = "重置用户密码")
    @PutMapping("/sysuser/resetpwd")
    public ResultVo resetPassword(@RequestParam("id") List<Long> lstId){
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("id", lstId);

        SysUser sysUser = new SysUser();
        sysUser.setLoginPassword(SecureUtil.md5(UserConstant.INITIAL_PASSWORD));
        this.sysUserService.update(sysUser, queryWrapper);

        return ResultVoUtil.success();
    }
}
