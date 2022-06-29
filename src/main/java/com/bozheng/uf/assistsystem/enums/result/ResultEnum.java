package com.bozheng.uf.assistsystem.enums.result;

import lombok.Getter;

/**
 * @author jianjiawen
 * @date 2021-2-16 18:51
 */
@Getter
public enum ResultEnum {

    /**
     * 执行成功
     */
    SUCCESS("000", "执行成功"),
    UNKNOWN_ERROR("999","未知错误"),
    VALIDATE_ERROR("998","请求数据校验失败：")
    ;

    private final String code;
    private final String message;

    ResultEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
