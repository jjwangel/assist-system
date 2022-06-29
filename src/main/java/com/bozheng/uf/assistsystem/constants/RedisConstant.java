package com.bozheng.uf.assistsystem.constants;

/**
 * redis常量
 * @author jianjiawen
 * @date 2021-2-20 20:36
 */
public interface RedisConstant {
    String TOKEN_PREFIX = "token:login:user-info:%s";

    Integer EXPIRE = 7200; //2小时
}
