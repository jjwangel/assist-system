package com.bozheng.uf.assistsystem.mapper.ufaccount;

import com.bozheng.uf.assistsystem.domain.dto.ufaccount.InventoryDto;
import com.bozheng.uf.assistsystem.domain.entity.ufaccount.Inventory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jianjiawen
 * @date 2021-2-27 12:24
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class InventoryMapperTest {

    @Resource
    private InventoryMapper inventoryMapper;

    @Test
    public void findAll() {
//        List<Inventory> result = this.inventoryMapper.selectList(null);
//        result.forEach(System.out::println);
    }

    @Test
    public void findInventory() {
        List<InventoryDto> result = this.inventoryMapper.selectInventoryPage(null,null);
        result.forEach(System.out::println);

    }
}