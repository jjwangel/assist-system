package com.bozheng.uf.assistsystem.service.ufsystem;

import com.bozheng.uf.assistsystem.domain.entity.ufsystem.UaAccount;
import com.bozheng.uf.assistsystem.domain.dto.ufsystem.UfAccountDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * @author jianjiawen
 * @date 2021-2-16 18:24
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class AccountInfoServiceTest {

    @Autowired
    private AccountInfoService accountInfoService;

    @Test
    public void findAll(){
        List<UaAccount> result = accountInfoService.list(null);
        result.forEach(System.out::println);
    }

    @Test
    public void findUaAccountInfo(){
        List<UfAccountDto> result = accountInfoService.findAllAccount();
        result.forEach(System.out::println);
    }
}