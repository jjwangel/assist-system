package com.bozheng.uf.assistsystem.utils;

import com.bozheng.uf.assistsystem.domain.dto.ufsystem.LoginAccountInfoDto;

/**
 * @author jianjiawen
 * @date 2021-2-27 11:02
 */
public class LoginAccountHolder {

    private static ThreadLocal<LoginAccountInfoDto> threadLocal = new ThreadLocal<>();

    public static void setValue(LoginAccountInfoDto loginAccountInfoDto){
        threadLocal.set(loginAccountInfoDto);
    }

    public static LoginAccountInfoDto getValue(){
        return threadLocal.get();
    }

    public static void remove(){
        threadLocal.remove();
    }
}
