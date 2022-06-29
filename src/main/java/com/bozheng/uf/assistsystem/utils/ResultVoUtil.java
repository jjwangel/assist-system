package com.bozheng.uf.assistsystem.utils;

import com.bozheng.uf.assistsystem.domain.vo.ResultVo;
import com.bozheng.uf.assistsystem.enums.result.ResultEnum;

/**
 * @author jianjiawen
 * @date 2021-2-16 19:41
 */
public class ResultVoUtil {

    /**
     * http请求返回的最外层对象（执行成功）
     * @param object 返回数据
     * @return ResultVo
     */
    public static ResultVo success(Object object){
        return new ResultVo(ResultEnum.SUCCESS.getCode(),ResultEnum.SUCCESS.getMessage(),object);
    }

    /**
     * http请求返回的最外层对象（执行成功）
     * @return ResultVo
     */
    public static ResultVo success(){
        return success(null);
    }

    /**
     * http请求返回的最外层对象（执行失败）
     * @param code 返回码
     * @param message 返回信息
     * @return ResultVo
     */
    public static ResultVo error(String code, String message) {
        return new ResultVo(code, message, null);
    }

}
