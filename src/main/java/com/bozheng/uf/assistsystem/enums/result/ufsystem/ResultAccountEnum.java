package com.bozheng.uf.assistsystem.enums.result.ufsystem;

import lombok.Getter;

/**
 * 账套信息相关结查枚举
 *
 * @author jianjiawen
 * @date 2021-2-21 19:54
 */
@Getter
public enum ResultAccountEnum {

    /**
     * 有关账套信息的枚举
     */
    ACCOUNT_DATABASE_NOT_FOUND("300","账套对应数据库名称找不到"),
    ACCOUNT_NOT_FOUND("301", "账套数据找不到"),
    ;

    private final String code;
    private final String message;

    ResultAccountEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
