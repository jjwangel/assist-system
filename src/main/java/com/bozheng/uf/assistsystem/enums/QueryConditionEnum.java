package com.bozheng.uf.assistsystem.enums;

import lombok.Getter;

/**
 * @author jianjiawen
 * @date 2021-3-6 18:58
 */
@Getter
public enum QueryConditionEnum implements CodeEnum{

    /**
     * EQ:==
     */
    EQ( 0,"EQ"),
    /**
     * NE:!=
     */
    NE(1,"NE"),
    /**
     * GT:>
     */
    GT(2, "GT"),
    /**
     * GE:>=
     */
    GE(3, "GE"),
    /**
     * LT:<
     */
    LT(4, "LT"),
    /**
     * LE:<=
     */
    LE(5, "LE"),
    /**
     * LIKE:LIKE('%xx%')
     */
    LIKE(6, "LIKE"),
    /**
     * NOT_LIKE:NOT_LIKE('%xx%')
     */
    NOT_LIKE(7, "NOT_LIKE"),
    /**
     * LIKE_LEFT:LIKE_LEFT('%xx')
     */
    LIKE_LEFT(8, "LIKE_LEFT"),
    /**
     * LIKE_RIGHT:LIKE_RIGHT('xx%')
     */
    LIKE_RIGHT(9, "LIKE_RIGHT"),
    ;

    private final Integer code;
    private final String value;

    QueryConditionEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }
}
