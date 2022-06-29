package com.bozheng.uf.assistsystem.aspect;

import cn.dev33.satoken.SaTokenManager;
import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.bozheng.uf.assistsystem.constants.RedisConstant;
import com.bozheng.uf.assistsystem.domain.dto.ufsystem.LoginAccountInfoDto;
import com.bozheng.uf.assistsystem.enums.result.assistsys.user.ResultUserEnum;
import com.bozheng.uf.assistsystem.exception.assistsys.UserException;
import com.bozheng.uf.assistsystem.utils.LoginAccountHolder;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * 调用api前进行校验，例如：登录
 * @author jianjiawen
 * @date 2021-2-27 10:17
 */
@Component
@Aspect
@Slf4j
public class VerifyApi {

    private StringRedisTemplate redisTemplate;

    @Autowired
    private void setRedisTemplate(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Pointcut("@annotation(com.bozheng.uf.assistsystem.annotation.VerifyLogin)")
    public void vierifyLogin() {}

    @Before("vierifyLogin()")
    public void beforeVerifyLogin() {

        // 判断是否有登录
        StpUtil.checkLogin();

        //查询redis里的cookie
        LoginAccountInfoDto loginAccountInfoDto = null;
        String tokenValue = redisTemplate.opsForValue().get(String.format(RedisConstant.TOKEN_PREFIX, StpUtil.getTokenValue()));
        if (!StrUtil.hasEmpty(tokenValue)) {
            loginAccountInfoDto = JSONUtil.toBean(tokenValue, LoginAccountInfoDto.class);
            LoginAccountHolder.setValue(loginAccountInfoDto);
        } else {
            log.warn("Redis中查不到token");
            throw new UserException(ResultUserEnum.NOT_API_ACCESS_PERMISSION);
        }

        //更新redis
//        assert response != null;
        int expire = (int) SaTokenManager.getConfig().getActivityTimeout();

        this.redisTemplate.opsForValue().set(String.format(RedisConstant.TOKEN_PREFIX, StpUtil.getTokenValue()),
                JSONUtil.parse(loginAccountInfoDto).toString(), expire, TimeUnit.SECONDS);

    }

    @After("vierifyLogin()")
    public void afterVierifyLogin() {
        LoginAccountHolder.remove();
    }
}
