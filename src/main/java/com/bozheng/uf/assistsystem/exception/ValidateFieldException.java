package com.bozheng.uf.assistsystem.exception;

import com.bozheng.uf.assistsystem.enums.result.ResultEnum;
import com.bozheng.uf.assistsystem.enums.result.assistsys.user.ResultUserEnum;

/**
 *
 * @author jianjiawen
 * @date 2021-3-25 21:35
 */
public class ValidateFieldException extends CustomException {
    private static final long serialVersionUID = 3072523554503815113L;

    public ValidateFieldException(ResultEnum resultEnum,String message) {
        super(resultEnum.getCode(),resultEnum.getMessage() + message);
    }
}
