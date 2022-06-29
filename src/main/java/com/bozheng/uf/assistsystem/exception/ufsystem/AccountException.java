package com.bozheng.uf.assistsystem.exception.ufsystem;

import com.bozheng.uf.assistsystem.enums.result.ufsystem.ResultAccountEnum;
import com.bozheng.uf.assistsystem.exception.CustomException;

/**
 * 账套相关异常
 * @author jianjiawen
 * @date 2021-2-21 20:45
 */
public class AccountException extends CustomException {

    private static final long serialVersionUID = 624115319396269464L;

    public AccountException(ResultAccountEnum resultAccountEnum) {
        super(resultAccountEnum.getCode(), resultAccountEnum.getMessage());
    }
}
