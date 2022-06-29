package com.bozheng.uf.assistsystem.mapper.ufsystem;

import com.bozheng.uf.assistsystem.domain.entity.ufsystem.UaAccount;
import com.bozheng.uf.assistsystem.domain.dto.ufsystem.UfAccountDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

/**
 * @author jianjiawen
 * @date 2021-2-16 10:48
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UaAccountMapperTest {

    @Resource
    private UaAccountMapper uaAccountMapper;

    @Test
    public void findAll(){
        List<UaAccount> result = uaAccountMapper.selectList(null);
        result.forEach(System.out::println);
    }

    @Test
    public void findUaAccountInfo(){
        List<UfAccountDto> result = uaAccountMapper.selectUaAccountInfo(null);
        result.forEach(System.out::println);
    }
}