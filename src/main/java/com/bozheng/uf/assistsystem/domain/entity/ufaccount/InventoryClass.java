package com.bozheng.uf.assistsystem.domain.entity.ufaccount;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jianjiawen
 * @date 2021-4-3 16:00
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "InventoryClass")
public class InventoryClass {

    @TableId(value = "cInvCCode" ,type = IdType.INPUT)
    private String invcCode;

    @TableField(value = "cInvCName")
    private String invcName;

    @TableField(value = "iInvCGrade")
    private Byte invcGrade;

    @TableField(value = "bInvCEnd")
    private Boolean invcEnd;

    @TableField(value = "cEcoCode")
    private String ecoCode;

    @TableField(value = "cBarCode")
    private String barCode;

}
