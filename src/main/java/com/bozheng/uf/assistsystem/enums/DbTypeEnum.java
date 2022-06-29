package com.bozheng.uf.assistsystem.enums;

import lombok.Getter;

/**
 * @author jianjiawen
 * @date 2021-2-19 18:51
 */
@Getter
public enum DbTypeEnum implements CodeEnum{

    /**
     * MSSQL
     */
    MSSQL( 0,"MSSQL"),
    ;

    private final Integer code;
    private final String value;

    DbTypeEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }
}
