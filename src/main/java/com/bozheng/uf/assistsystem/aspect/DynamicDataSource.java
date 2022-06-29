package com.bozheng.uf.assistsystem.aspect;

import com.bozheng.uf.assistsystem.domain.dto.ufsystem.LoginAccountInfoDto;
import com.bozheng.uf.assistsystem.enums.result.ufsystem.ResultAccountEnum;
import com.bozheng.uf.assistsystem.exception.ufsystem.AccountException;
import com.bozheng.uf.assistsystem.utils.DataSourceHolder;
import com.bozheng.uf.assistsystem.utils.LoginAccountHolder;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author jianjiawen
 * @date 2021-2-19 21:31
 */
@Component
@Aspect
@Slf4j
public class DynamicDataSource {
    @Pointcut("execution(* com.bozheng.uf.assistsystem.mapper.ufsystem..*.*(..))")
    public void changeUfSystem() {}

    @Pointcut("execution(* com.bozheng.uf.assistsystem.mapper.ufaccount..*.*(..))")
    public void changeUfAccount() {}

    @Before("changeUfSystem()")
    public void beforeChangeUfSystem() {
        DataSourceHolder.setKey("ufsystem");
    }

    @After("changeUfSystem()")
    public void afterChangeUfSystem() {
        DataSourceHolder.remove();
    }

    @Before("changeUfAccount()")
    public void beforeChangeUfAccount() {

        LoginAccountInfoDto loginAccountInfoDto = LoginAccountHolder.getValue();
        if (null == loginAccountInfoDto) {
            throw new AccountException(ResultAccountEnum.ACCOUNT_DATABASE_NOT_FOUND);
        } else {
            DataSourceHolder.setKey(loginAccountInfoDto.getAccDataBase());
        }
    }

    @After("changeUfAccount()")
    public void afterChangeUfAccount() {
        DataSourceHolder.remove();
    }


}
