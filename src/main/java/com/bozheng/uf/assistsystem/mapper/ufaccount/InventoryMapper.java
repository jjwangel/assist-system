package com.bozheng.uf.assistsystem.mapper.ufaccount;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.bozheng.uf.assistsystem.domain.dto.ufaccount.InventoryDto;
import com.bozheng.uf.assistsystem.domain.entity.ufaccount.Inventory;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author jianjiawen
 * @date 2021-2-27 12:23
 */
public interface InventoryMapper extends BaseMapper<Inventory> {

    /**
     * 查询存货档案信息
     * @author jianjiawen
     * @date 2021-3-27 14:29
     * @param page page
     * @param queryWrapper queryWrapper
     * @return E
     */
    @Select("SELECT\n" +
            "Inventory.cInvCode AS invCode,\n" +
            "Inventory.cInvAddCode AS invAddCode,\n" +
            "Inventory.cInvName AS invName,\n" +
            "Inventory.cInvStd AS invStd,\n" +
            "Inventory.cInvCCode AS invcCode,\n" +
            "Inventory.cVenCode AS venCode,\n" +
            "Inventory.iTaxRate AS taxRate,\n" +
            "Inventory.cComUnitCode AS comUnitCode,\n" +
            "InventoryClass.cInvCName AS invcName,\n" +
            "Vendor.cVenName AS venName,\n" +
            "ComputationUnit.cComUnitName AS comUnitName \n" +
            "FROM\n" +
            "Inventory\n" +
            "INNER JOIN InventoryClass ON Inventory.cInvCCode = InventoryClass.cInvCCode\n" +
            "LEFT JOIN Vendor ON Inventory.cVenCode = Vendor.cVenCode\n" +
            "INNER JOIN ComputationUnit ON Inventory.cComUnitCode = ComputationUnit.cComunitCode ${ew.customSqlSegment}")
    <E extends IPage<InventoryDto>> E selectInventoryPage(E page, @Param(Constants.WRAPPER) Wrapper<InventoryDto> queryWrapper);
}
