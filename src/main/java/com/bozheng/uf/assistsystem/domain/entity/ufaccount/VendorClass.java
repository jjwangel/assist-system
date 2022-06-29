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
 * @date 2021-4-14 16:00
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "VendorClass")
public class VendorClass {

    @TableId(value = "cVCCode" ,type = IdType.INPUT)
    private String vcCode;

    @TableField(value = "cVCName")
    private String vcName;

    @TableField(value = "iVCGrade")
    private Byte vcGrade;

    @TableField(value = "bVCEnd")
    private Boolean vcEnd;

}
