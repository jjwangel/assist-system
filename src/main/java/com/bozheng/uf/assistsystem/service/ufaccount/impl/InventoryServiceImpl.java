package com.bozheng.uf.assistsystem.service.ufaccount.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bozheng.uf.assistsystem.domain.dto.ufaccount.InventoryDto;
import com.bozheng.uf.assistsystem.domain.entity.ufaccount.Inventory;
import com.bozheng.uf.assistsystem.mapper.ufaccount.InventoryMapper;
import com.bozheng.uf.assistsystem.service.ufaccount.InventoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jianjiawen
 * @date 2021-2-27 15:29
 */
@Service
public class InventoryServiceImpl extends ServiceImpl<InventoryMapper, Inventory> implements InventoryService {

    @Resource
    private InventoryMapper inventoryMapper;

    /**
     * 
     * @author jianjiawen
     * @date 2021-3-24 15:54
     * @param page 当前页码
     * @param size 每页大小
     * @param queryWrapper queryWrapper
     * @return com.baomidou.mybatisplus.core.metadata.IPage<com.bozheng.uf.assistsystem.domain.entity.ufaccount.Inventory>
     */
    @Override
    public IPage<InventoryDto> findInventoryByPage(long page, long size, Wrapper<InventoryDto> queryWrapper) {
        IPage<InventoryDto> pageInst = new Page<>(page, size);
        return this.inventoryMapper.selectInventoryPage(pageInst, queryWrapper);

    }

}
