package com.bozheng.uf.assistsystem.service.ufsystem;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bozheng.uf.assistsystem.domain.entity.ufsystem.UaAccount;
import com.bozheng.uf.assistsystem.domain.dto.ufsystem.LoginAccountInfoDto;
import com.bozheng.uf.assistsystem.domain.dto.ufsystem.UfAccountDto;

import java.util.Date;
import java.util.List;

/**
 * @author jianjiawen
 * @date 2021-2-16 18:18
 */
public interface AccountInfoService extends IService<UaAccount> {

    /**
     * 查询账套相关信息
     * @return List<UfAccountDto>
     */
    List<UfAccountDto> findAllAccount();

    /**
     * 根据登录信息获取连接数据库
     * @param accId 账套号
     * @param loginDate 所选时间
     * @return LoginAccountInfoDto
     */
    LoginAccountInfoDto findLoginAccountInfo(String accId, Date loginDate);
}
