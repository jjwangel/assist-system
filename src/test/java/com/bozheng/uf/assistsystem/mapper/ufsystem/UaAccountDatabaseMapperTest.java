package com.bozheng.uf.assistsystem.mapper.ufsystem;

import com.bozheng.uf.assistsystem.domain.entity.ufsystem.UaAccountDatabase;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jianjiawen
 * @date 2021-2-16 10:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UaAccountDatabaseMapperTest {

    @Resource
    private UaAccountDatabaseMapper uaAccountDatabaseMapper;

    @Test
    public void findAll(){
        List<UaAccountDatabase> result = uaAccountDatabaseMapper.selectList(null);
        result.forEach(System.out::println);
    }

}