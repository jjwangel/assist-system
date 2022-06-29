package com.bozheng.uf.assistsystem.service.ufaccount;

import com.bozheng.uf.assistsystem.domain.entity.ufaccount.Inventory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jianjiawen
 * @date 2021-2-27 15:29
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class InventoryServiceTest {

    @Autowired
    private InventoryService inventoryService;

    @Test
    public void findAll() {
//        List<Inventory> result = this.inventoryService.list();
//        result.forEach(System.out::println);
    }
}