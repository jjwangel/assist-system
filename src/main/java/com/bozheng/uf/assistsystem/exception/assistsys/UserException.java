package com.bozheng.uf.assistsystem.exception.assistsys;

import com.bozheng.uf.assistsystem.enums.result.assistsys.user.ResultUserEnum;
import com.bozheng.uf.assistsystem.exception.CustomException;

/**
 * 系统用户相关异常
 *
 * @author jianjiawen
 * @date 2021-2-21 19:42
 */
public class UserException extends CustomException {
    private static final long serialVersionUID = 2610059463015076122L;

    public UserException(ResultUserEnum resultUserEnum) {
        super(resultUserEnum.getCode(),resultUserEnum.getMessage());
    }
}
