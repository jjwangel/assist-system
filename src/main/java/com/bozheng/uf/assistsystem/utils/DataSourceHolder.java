package com.bozheng.uf.assistsystem.utils;

/**
 * @author jianjiawen
 * @date 2021-2-19 16:41
 */
public class DataSourceHolder {

    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void setKey(String key){
        threadLocal.set(key);
    }

    public static String getKey(){
        return threadLocal.get();
    }

    public static void remove(){
        threadLocal.remove();
    }
}
