package com.bozheng.uf.assistsystem.enums.result.ufsystem;

import lombok.Getter;

/**
 * 用友用户相关结果枚举
 *
 * @author jianjiawen
 * @date 2021-2-21 19:54
 */
@Getter
public enum ResultUserEnum {

    /**
     * 有关用友用户信息的枚举
     */
    UF_USER_NOT_FOUND("310","用友用户数据找不到！"),
    ;

    private final String code;
    private final String message;

    ResultUserEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
