package com.bozheng.uf.assistsystem.exception;

import lombok.Getter;

/**
 * @author jianjiawen
 * @date 2021-2-21 20:07
 */
@Getter
public class CustomException extends RuntimeException {

    private static final long serialVersionUID = 6171197886876453052L;

    private final String code;

    public CustomException(String code, String message) {
        super(message);
        this.code = code;
    }
}
