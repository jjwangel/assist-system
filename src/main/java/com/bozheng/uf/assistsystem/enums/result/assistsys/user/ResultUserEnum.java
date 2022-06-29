package com.bozheng.uf.assistsystem.enums.result.assistsys.user;

import lombok.Getter;

/**
 * 用户相关的结查枚举
 * @author jianjiawen
 * @date 2021-2-21 19:51
 */
@Getter
public enum ResultUserEnum {

    /**
     * 100:登录ID或密码不正确
     */
    USERID_OR_PASSWORD_NOT_MATCH("100","登录ID或密码不正确"),
    NOT_API_ACCESS_PERMISSION("101","没有调用接口权限！"),
    ;

    private final String code;
    private final String message;

    ResultUserEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
