package com.bozheng.uf.assistsystem.domain.dto.ufsystem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户登录后账套相关信息
 * @author jianjiawen
 * @date 2021-2-21 11:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginAccountInfoDto {

    /**
     * 账套号
     */
    private String accId;

    /**
     * 登录所选日期，格工：yyyy-MM-dd
     */
    private String accDate;

    /**
     * 账套数据库（跟据套账号与登录所选日期）
     */
    private String accDataBase;
}
