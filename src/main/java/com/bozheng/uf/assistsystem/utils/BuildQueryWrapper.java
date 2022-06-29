package com.bozheng.uf.assistsystem.utils;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bozheng.uf.assistsystem.annotation.QueryField;
import com.bozheng.uf.assistsystem.enums.QueryConditionEnum;

import java.lang.reflect.Field;
import java.util.List;

/**
 * @author jianjiawen
 * @date 2021-3-6 14:58
 */
public class BuildQueryWrapper<T> {

    public QueryWrapper<T> buildQw(Object obj) throws IllegalAccessException {
        QueryWrapper<T> queryWrapper = new QueryWrapper<>();
        Class clazz = obj.getClass();
        for (; clazz != Object.class; clazz = clazz.getSuperclass()) {
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);

                if ("orderBy".equals(field.getName())) {
                    String orderByField = null == field.get(obj) ? "" : field.get(obj).toString();
                    if (!StrUtil.isEmptyIfStr(orderByField)) {
                        List<String> lstOrderBy = StrUtil.split(orderByField, ',', true, true);
                        if (null != lstOrderBy && lstOrderBy.size() > 0) {
                            for (String orderBy : lstOrderBy) {
                                List<String> lstValue = StrUtil.split(orderBy, ' ', true, true);
                                if (null != lstValue && lstValue.size() > 0) {
                                    if (lstValue.size() == 2) {
                                        if ("desc".equalsIgnoreCase(StrUtil.trimToEmpty(lstValue.get(1)))) {
                                            queryWrapper.orderByDesc(lstValue.get(0));
                                        } else {
                                            queryWrapper.orderByAsc(lstValue.get(0));
                                        }
                                    } else {
                                        queryWrapper.orderByAsc(lstValue.get(0));
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (!StrUtil.isEmptyIfStr(field.get(obj))) {
                        if (field.isAnnotationPresent(QueryField.class)) {
                            String tableField = field.getAnnotation(QueryField.class).value();
                            QueryConditionEnum qcEnum = field.getAnnotation(QueryField.class).qcEnum();

                            switch (qcEnum) {
                                case NE:
                                    queryWrapper.ne(tableField, field.get(obj));
                                    break;
                                case GT:
                                    queryWrapper.gt(tableField, field.get(obj));
                                    break;
                                case GE:
                                    queryWrapper.ge(tableField, field.get(obj));
                                    break;
                                case LT:
                                    queryWrapper.lt(tableField, field.get(obj));
                                    break;
                                case LE:
                                    queryWrapper.le(tableField, field.get(obj));
                                    break;
                                case LIKE:
                                    queryWrapper.like(tableField, field.get(obj));
                                    break;
                                case NOT_LIKE:
                                    queryWrapper.notLike(tableField, field.get(obj));
                                    break;
                                case LIKE_LEFT:
                                    queryWrapper.likeLeft(tableField, field.get(obj));
                                    break;
                                case LIKE_RIGHT:
                                    queryWrapper.likeRight(tableField, field.get(obj));
                                    break;
                                default:
                                    queryWrapper.eq(tableField, field.get(obj));
                                    break;
                            }
                        }
                    }
                }
            }
        }



        return queryWrapper;
    }
}
