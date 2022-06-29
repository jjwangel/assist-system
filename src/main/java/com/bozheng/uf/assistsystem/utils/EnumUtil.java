package com.bozheng.uf.assistsystem.utils;

import com.bozheng.uf.assistsystem.enums.CodeEnum;

/**
 * @author jianjiawen
 * @date 2021-2-20 22:01
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
