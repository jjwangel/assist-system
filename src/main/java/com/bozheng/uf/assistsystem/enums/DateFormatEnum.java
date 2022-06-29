package com.bozheng.uf.assistsystem.enums;

import lombok.Getter;

/**
 * 日期格式枚举
 *
 * @author jianjiawen
 * @date 2021-2-21 14:26
 */
@Getter
public enum DateFormatEnum {

    /**
     * 年
     */
    YYYY(0, "yyyy"),
    /**
     * 月
     */
    MM(1, "MM"),
    /**
     * 日
     */
    DD(2, "dd"),
    /**
     * 年-月-日
     */
    YYYY_MM_DD(3, "yyyy-MM-dd"),
    /**
     * 年月日
     */
    YYYYMMDD(4, "yyyyMMdd"),
    /**
     * 时
     */
    HH(5, "HH"),
    /**
     * 分
     */
    M(6, "mm"),
    /**
     * 秒
     */
    SS(7, "ss"),
    /**
     * 时-分-秒
     */
    HH_MM_SS(8, "HH:mm:ss"),
    ;

    private final Integer code;
    private final String value;

    DateFormatEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

}
