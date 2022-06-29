package com.bozheng.uf.assistsystem.mapper.ufsystem;

import com.bozheng.uf.assistsystem.domain.entity.ufsystem.UaAccountSub;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jianjiawen
 * @date 2021-2-16 10:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UaAccountSubMapperTest {

    @Resource
    private UaAccountSubMapper uaAccountSubMapper;

    @Test
    public void findAll(){
        List<UaAccountSub> result = uaAccountSubMapper.selectList(null);
        result.forEach(System.out::println);
    }
}