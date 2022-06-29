package com.bozheng.uf.assistsystem.service.assistsys.impl;

import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bozheng.uf.assistsystem.constants.assistsys.UserConstant;
import com.bozheng.uf.assistsystem.domain.entity.assistsys.SysUser;
import com.bozheng.uf.assistsystem.domain.entity.ufsystem.UaUser;
import com.bozheng.uf.assistsystem.domain.vo.response.assistsys.SyncSysUserVo;
import com.bozheng.uf.assistsystem.enums.result.assistsys.user.ResultUserEnum;
import com.bozheng.uf.assistsystem.exception.assistsys.UserException;
import com.bozheng.uf.assistsystem.mapper.assistsys.SysUserMapper;
import com.bozheng.uf.assistsystem.service.assistsys.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author jianjiawen
 * @date 2021-2-21 17:11
 */
@Service
@Slf4j
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    /**
     * 系统登录
     * @param loginId 登录ID
     * @param loginPassword 登录密码
     * @return SysUser
     */
    @Override
    public SysUser login(String loginId, String loginPassword) {
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("login_id", loginId)
                .eq("login_password", SecureUtil.md5(loginPassword))
                .eq("is_delete", 0);

        SysUser sysUser = this.getOne(queryWrapper);
        if (sysUser == null) {
            throw new UserException(ResultUserEnum.USERID_OR_PASSWORD_NOT_MATCH);
        }
        return sysUser;
    }

    /**
     * 查找所有系统用户（包括逻辑删除的用户）
     * @author jianjiawen
     * @date 2021-4-10 18:16
     * @return java.util.List<com.bozheng.uf.assistsystem.domain.entity.assistsys.SysUser>
     */
    @Override
    public List<SysUser> findAllSysUser() {
        return this.sysUserMapper.selectAllSysUser();
    }

    /**
     * 同步UFsystem用户
     * @return SyncSysUserVo
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public SyncSysUserVo syncSysUserFromUf(List<UaUser> lstSource) {

        if (null == lstSource || lstSource.isEmpty()) {
            throw new com.bozheng.uf.assistsystem.exception.ufsystem.UserException(com.bozheng.uf.assistsystem.enums.result.ufsystem.ResultUserEnum.UF_USER_NOT_FOUND);
        }

        AtomicInteger createCount = new AtomicInteger();
        AtomicInteger updateCount = new AtomicInteger();
        AtomicInteger ignoreCount = new AtomicInteger();

        //1.获取bz_uf_assist_system用户全部记录
        List<SysUser> lstTarget = this.findAllSysUser();

        //2.判断bz_uf_assist_system如果不存在UFSystem的用户则添加，否则更新
        lstSource.forEach(uaUser -> {
            List<SysUser> sysUsers = ListUtil.filter(lstTarget, v -> v.getLoginId().trim().equals(uaUser.getUserId().trim()) ? v : null);
            SysUser sysUser = new SysUser();

            if (sysUsers.isEmpty()) {
                sysUser.setLoginId(StrUtil.trimToEmpty(uaUser.getUserId()));
                sysUser.setUserName(StrUtil.trimToEmpty(uaUser.getUserName()));
                sysUser.setSex((byte) 0);
                sysUser.setLoginPassword(SecureUtil.md5(UserConstant.INITIAL_PASSWORD));
                sysUser.setDepartment(StrUtil.trimToEmpty(uaUser.getDept()));
                createCount.getAndIncrement();

                this.sysUserMapper.insert(sysUser);
            } else {
                if (!Convert.toBool(sysUsers.get(0).getIsDelete(), true)) {
                    sysUser.setId(sysUsers.get(0).getId());
                    sysUser.setUserName(StrUtil.trimToEmpty(uaUser.getUserName()));
                    sysUser.setSex((byte) 0);
                    sysUser.setDepartment(StrUtil.trimToEmpty(uaUser.getDept()));
                    sysUser.setCreateTime(sysUsers.get(0).getCreateTime());

                    updateCount.getAndIncrement();
                    this.sysUserMapper.updateById(sysUser);
                } else {
                    ignoreCount.getAndIncrement();
                }
            }
        });

        return new SyncSysUserVo(createCount.get(),updateCount.get(),ignoreCount.get());
    }

    /**
     *
     * @author jianjiawen
     * @date 2021-4-8 19:44
     * @param page page
     * @param size size
     * @param queryWrapper queryWrapper
     * @return com.baomidou.mybatisplus.core.metadata.IPage<com.bozheng.uf.assistsystem.domain.dto.assistsys.SysUserDto>
     */
    @Override
    public IPage<SysUser> findSysUserByPage(long page, long size, Wrapper<SysUser> queryWrapper) {
        IPage<SysUser> pageInst = new Page<>(page, size);
        return this.page(pageInst, queryWrapper);
    }

    /**
     * 恢复删除的用户
     * @author jianjiawen
     * @date 2021-4-11 13:50
     * @param lstId lstId
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void restoreSysUser(List<Long> lstId) {
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("id", lstId);
        this.sysUserMapper.restoreSysUser(LocalDateTime.now(), queryWrapper);
    }

}
