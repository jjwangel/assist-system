package com.bozheng.uf.assistsystem.exception.ufsystem;

import com.bozheng.uf.assistsystem.enums.result.ufsystem.ResultAccountEnum;
import com.bozheng.uf.assistsystem.enums.result.ufsystem.ResultUserEnum;
import com.bozheng.uf.assistsystem.exception.CustomException;

/**
 * 用友用户相关异常
 * @author jianjiawen
 * @date 2021-2-21 20:45
 */
public class UserException extends CustomException {

    private static final long serialVersionUID = -1627163112672268662L;

    public UserException(ResultUserEnum resultUserEnum) {
        super(resultUserEnum.getCode(), resultUserEnum.getMessage());
    }
}
