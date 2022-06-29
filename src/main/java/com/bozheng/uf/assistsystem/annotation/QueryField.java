package com.bozheng.uf.assistsystem.annotation;

import com.bozheng.uf.assistsystem.enums.QueryConditionEnum;

import java.lang.annotation.*;

/**
 * @author jianjiawen
 * @date 2021-3-6 18:52
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
public @interface QueryField {
    String value() default "";
    QueryConditionEnum qcEnum() default QueryConditionEnum.EQ;
}
