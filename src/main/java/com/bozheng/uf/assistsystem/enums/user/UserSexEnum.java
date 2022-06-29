package com.bozheng.uf.assistsystem.enums.user;

import com.bozheng.uf.assistsystem.enums.CodeEnum;
import lombok.Getter;

/**
 * @author jianjiawen
 * @date 2021-2-20 20:57
 */
@Getter
public enum UserSexEnum implements CodeEnum {

    /**
     * 性别：男
     */
    SEX_MALE(0,"男"),
    /**
     * 性别：女
     */
    SEX_FEMALE(1,"女")
    ;

    private final Integer code;
    private final String value;

    UserSexEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }
}
