package com.bozheng.uf.assistsystem.service.assistsys;

import com.bozheng.uf.assistsystem.domain.entity.assistsys.SysDbConnectInfo;
import com.bozheng.uf.assistsystem.mapper.assistsys.SysDbConnectInfoMapper;
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
 * @date 2021-2-19 8:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SysDbConnectInfoServiceTest {

    @Resource
    private SysDbConnectInfoMapper sysDbConnectInfoMapper;

    @Test
    public void findAll() {
        List<SysDbConnectInfo> result = sysDbConnectInfoMapper.selectList(null);
        result.forEach(System.out::println);
    }

}