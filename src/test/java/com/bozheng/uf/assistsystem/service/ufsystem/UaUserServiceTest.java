package com.bozheng.uf.assistsystem.service.ufsystem;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bozheng.uf.assistsystem.domain.entity.ufsystem.UaUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author jianjiawen
 * @date 2021-2-25 19:56
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UaUserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void findAll() {
        QueryWrapper<UaUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("cUser_Id","demo");
        List<UaUser> result = this.userService.list(queryWrapper);
        result.forEach(System.out::println);
    }

}