package com.bozheng.uf.assistsystem.service.ufaccount;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bozheng.uf.assistsystem.domain.dto.ufaccount.InventoryDto;
import com.bozheng.uf.assistsystem.domain.entity.ufaccount.Inventory;

import java.util.List;

/**
 * @author jianjiawen
 * @date 2021-2-27 15:28
 */
public interface InventoryService extends IService<Inventory> {

    /**
     * 分页查询存货档案
     * @param page 当前页码
     * @param size 每页大小
     * @param queryWrapper 查询条件
     * @return IPage<Inventory>
     */
    IPage<InventoryDto> findInventoryByPage(long page, long size, Wrapper<InventoryDto> queryWrapper);

}
