package com.bozheng.uf.assistsystem.service.assistsys;

import com.bozheng.uf.assistsystem.AssistSystemApplication;
import com.bozheng.uf.assistsystem.domain.entity.assistsys.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jianjiawen
 * @date 2021-2-21 17:12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SysUserServiceTest {

    @Resource
    private SysUserService sysUserService;

    @Test
    public void findAll() {
        List<SysUser> result = this.sysUserService.list(null);
        result.forEach(System.out::println);
    }

    @Test
    public void addRecord() {
        SysUser sysUser = new SysUser();
        sysUser.setLoginId("test");
        sysUser.setUserName("测试");
        sysUser.setSex((byte) 0);
        sysUser.setDepartment("科技部");
        sysUser.setLoginPassword(DigestUtils.md5DigestAsHex(("test888888").getBytes()));

        this.sysUserService.save(sysUser);
    }
}