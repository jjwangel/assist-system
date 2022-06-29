package com.bozheng.uf.assistsystem.domain.dto.ufaccount;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bozheng.uf.assistsystem.domain.entity.ufaccount.Inventory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author jianjiawen
 * @date 2021-2-27 11:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryDto {

    /**
     * 存货编码
     */
    private String invCode;

    /**
     * 存货代码
     */
    private String invAddCode;

    /**
     * 存货名称
     */
    private String invName;

    /**
     * 规格型号
     */
    private String invStd;

    /**
     * 存货大类编码
     */
    private String invcCode;

    /**
     * 供应商编码
     */
    private String venCode;

    /**
     * 税率
     */
    private Float taxRate;

    /**
     * 主计量单位编码
     */
    private String comUnitCode;

    /**
     * 存货大类名称
     */
    private String invcName;

    /**
     * 供应商名称
     */
    private String venName;

    /**
     * 主计量单位名称
     */
    private String comUnitName;

}
