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
 * @date 2021-4-13 16:00
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "CustomerClass")
public class CustomerClass {

    @TableId(value = "cCCCode" ,type = IdType.INPUT)
    private String ccCode;

    @TableField(value = "cCCName")
    private String ccName;

    @TableField(value = "iCCGrade")
    private Byte ccGrade;

    @TableField(value = "bCCEnd")
    private Boolean ccEnd;

}
