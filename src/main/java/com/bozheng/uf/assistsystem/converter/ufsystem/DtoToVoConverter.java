package com.bozheng.uf.assistsystem.converter.ufsystem;

import org.springframework.beans.BeanUtils;
import java.util.ArrayList;
import java.util.List;

/**
 * DtoToVoConverter
 * @author jianjiawen
 * @date 2021-2-27 19:14
 */
public class DtoToVoConverter {

    public static <T, E> E toVo(T dto, Class<E> vo) throws InstantiationException, IllegalAccessException {
        E instance = vo.newInstance();
        BeanUtils.copyProperties(dto, instance);
        return instance;
    }

    public static <T, E> List<E> toVo(List<T> lstDto, Class<E> vo) throws InstantiationException, IllegalAccessException {
        List<E> lstResult = new ArrayList<>();
        for (T dto : lstDto) {
            lstResult.add(DtoToVoConverter.toVo(dto, vo));
        }
        return lstResult;
    }

}
