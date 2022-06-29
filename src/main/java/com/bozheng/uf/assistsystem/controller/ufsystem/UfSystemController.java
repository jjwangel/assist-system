package com.bozheng.uf.assistsystem.controller.ufsystem;

import com.bozheng.uf.assistsystem.converter.ufsystem.DtoToVoConverter;
import com.bozheng.uf.assistsystem.domain.dto.ufsystem.UfAccountDto;
import com.bozheng.uf.assistsystem.domain.vo.ResultVo;
import com.bozheng.uf.assistsystem.domain.vo.response.ufsystem.UfAccountVo;
import com.bozheng.uf.assistsystem.enums.result.ufsystem.ResultAccountEnum;
import com.bozheng.uf.assistsystem.exception.ufsystem.AccountException;
import com.bozheng.uf.assistsystem.service.ufsystem.AccountInfoService;
import com.bozheng.uf.assistsystem.utils.ResultVoUtil;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jianjiawen
 * @date 2021-2-16 20:13
 */
@Api(tags = "UFSystem")
@RestController
@RequestMapping("/ufsystem")
@Slf4j
public class UfSystemController {

    private AccountInfoService accountInfoService;

    @Autowired
    private void setUaAccountService (AccountInfoService accountInfoService) {
        this.accountInfoService = accountInfoService;
    }

    @ApiOperationSupport(author = "jianjiawen")
    @ApiResponse(code=200,message = "返回ResultVo对像")
    @ApiOperation(value = "获取用友账套列表数据")
    @GetMapping("/accounts")
    public ResultVo<UfAccountVo> findAccount() throws InstantiationException, IllegalAccessException {
        List<UfAccountDto> lstUfAccountDto = accountInfoService.findAllAccount();
        if (lstUfAccountDto == null || lstUfAccountDto.isEmpty()) {
            throw new AccountException(ResultAccountEnum.ACCOUNT_NOT_FOUND);
        }

        return ResultVoUtil.success(DtoToVoConverter.toVo(lstUfAccountDto, UfAccountVo.class));
    }

}
