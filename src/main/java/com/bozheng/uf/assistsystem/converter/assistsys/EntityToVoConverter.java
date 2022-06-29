package com.bozheng.uf.assistsystem.converter.assistsys;

import org.springframework.beans.BeanUtils;
import java.util.ArrayList;
import java.util.List;

/**
 * EntityToVoConverter
 * @author jianjiawen
 * @date 2021-4-8 19:14
 */
public class EntityToVoConverter {

    public static <T, E> E toVo(T entity, Class<E> vo) throws InstantiationException, IllegalAccessException {
        E instance = vo.newInstance();
        BeanUtils.copyProperties(entity, instance);
        return instance;
    }

    public static <T, E> List<E> toVo(List<T> lstEntity, Class<E> vo) throws InstantiationException, IllegalAccessException {
        List<E> lstResult = new ArrayList<>();
        for (T entity : lstEntity) {
            lstResult.add(EntityToVoConverter.toVo(entity, vo));
        }
        return lstResult;
    }
}
