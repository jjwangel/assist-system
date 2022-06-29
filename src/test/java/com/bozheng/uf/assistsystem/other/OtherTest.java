package com.bozheng.uf.assistsystem.other;

import cn.hutool.core.lang.Console;
import cn.hutool.crypto.SecureUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bozheng.uf.assistsystem.domain.entity.ufaccount.Inventory;
import com.bozheng.uf.assistsystem.domain.vo.request.ufaccount.inventory.InventoryQueryVo;
import com.bozheng.uf.assistsystem.service.ufaccount.InventoryService;
import com.bozheng.uf.assistsystem.utils.BuildQueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author jianjiawen
 * @date 2021-2-21 16:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OtherTest {

    @Autowired
    private InventoryService inventoryService;

    @Test
    public void stringToMd5() {
        Console.log(SecureUtil.md5("admin888888"));
    }

    @Test
    public void other() throws IllegalAccessException {
//        InventoryQueryVo inventoryQueryVo = new InventoryQueryVo();
//        inventoryQueryVo.setInvCode("1111");
//        inventoryQueryVo.setInvName("2222");
//        BuildQueryWrapper<Inventory> buildQueryWrapper = new BuildQueryWrapper<>();
//
//        QueryWrapper<Inventory> queryWrapper = buildQueryWrapper.buildQw(inventoryQueryVo);
//
//        List<Inventory> result = this.inventoryService.list(queryWrapper);
//        result.forEach(System.out::println);

    }

}
