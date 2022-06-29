package com.bozheng.uf.assistsystem.service.ufsystem.impl;

import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bozheng.uf.assistsystem.domain.entity.ufsystem.UaAccount;
import com.bozheng.uf.assistsystem.domain.entity.ufsystem.UaAccountDatabase;
import com.bozheng.uf.assistsystem.domain.dto.ufsystem.LoginAccountInfoDto;
import com.bozheng.uf.assistsystem.domain.dto.ufsystem.UfAccountDto;
import com.bozheng.uf.assistsystem.enums.result.ufsystem.ResultAccountEnum;
import com.bozheng.uf.assistsystem.exception.ufsystem.AccountException;
import com.bozheng.uf.assistsystem.mapper.ufsystem.UaAccountDatabaseMapper;
import com.bozheng.uf.assistsystem.mapper.ufsystem.UaAccountMapper;
import com.bozheng.uf.assistsystem.service.ufsystem.AccountInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author jianjiawen
 * @date 2021-2-16 18:20
 */
@Service
public class AccountInfoServiceImpl extends ServiceImpl<UaAccountMapper, UaAccount> implements AccountInfoService {

    @Resource
    private UaAccountMapper uaAccountMapper;

    @Resource
    private UaAccountDatabaseMapper uaAccountDatabaseMapper;

    @Override
    public List<UfAccountDto> findAllAccount() {
        return uaAccountMapper.selectUaAccountInfo(null);
    }

    @Override
    public LoginAccountInfoDto findLoginAccountInfo(String accId, Date loginDate) {

        LoginAccountInfoDto loginAccountInfoDto = null;

        QueryWrapper<UaAccountDatabase> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("cAcc_Id", accId)
                .and(qw -> qw.le("iBeginYear", DateUtil.year(loginDate))
                        .apply("isnull(iEndYear,2099)>={0}", DateUtil.year(loginDate)));
        UaAccountDatabase uaAccountDatabase = uaAccountDatabaseMapper.selectOne(queryWrapper);

        if (uaAccountDatabase == null) {
            throw new AccountException(ResultAccountEnum.ACCOUNT_DATABASE_NOT_FOUND);
        }

        loginAccountInfoDto = new LoginAccountInfoDto(uaAccountDatabase.getAccId(), DateUtil.formatDate(loginDate)
                , uaAccountDatabase.getAccDataBase());

        return loginAccountInfoDto;
    }
}
