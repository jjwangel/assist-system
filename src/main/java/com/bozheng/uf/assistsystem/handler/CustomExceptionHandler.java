package com.bozheng.uf.assistsystem.handler;

import cn.dev33.satoken.exception.NotLoginException;
import com.bozheng.uf.assistsystem.domain.vo.ResultVo;
import com.bozheng.uf.assistsystem.enums.result.ResultEnum;
import com.bozheng.uf.assistsystem.enums.result.assistsys.user.ResultUserEnum;
import com.bozheng.uf.assistsystem.exception.CustomException;
import com.bozheng.uf.assistsystem.utils.ResultVoUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jianjiawen
 * @date 2021-2-21 20:13
 */
@ControllerAdvice
@Slf4j
public class CustomExceptionHandler {

    /**
     * 拦截自定义的异常
     * @param e CustomException
     * @return ResultVo
     */
    @ExceptionHandler(value = CustomException.class)
    @ResponseBody
    public ResultVo handlerCustomException(CustomException e) {
        log.error("CustomException:", e);
        return ResultVoUtil.error(e.getCode(), e.getMessage());
    }

    /**
     * 拦截NotLoginException的异常
     * @param e CustomException
     * @return ResultVo
     */
    @ExceptionHandler(value = NotLoginException.class)
    @ResponseBody
    public ResultVo handlerNotLoginExceptions(NotLoginException e) {
        log.error("NotLoginException:", e);
        return ResultVoUtil.error(ResultUserEnum.NOT_API_ACCESS_PERMISSION.getCode(), ResultUserEnum.NOT_API_ACCESS_PERMISSION.getMessage());
    }

    /**
     * 拦截未知的异常
     * @param e RuntimeException
     * @return ResultVo
     */
    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public ResultVo handlerException(RuntimeException e) {
        log.error("handlerException:", e);
        return ResultVoUtil.error(ResultEnum.UNKNOWN_ERROR.getCode(), ResultEnum.UNKNOWN_ERROR.getMessage());
    }
}
