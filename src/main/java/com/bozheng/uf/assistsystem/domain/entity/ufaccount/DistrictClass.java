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
 * @date 2021-4-15 16:00
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "DistrictClass")
public class DistrictClass {

    @TableId(value = "cDCCode" ,type = IdType.INPUT)
    private String dcCode;

    @TableField(value = "cDCName")
    private String dcName;

    @TableField(value = "iDCGrade")
    private Byte dcGrade;

    @TableField(value = "bDCEnd")
    private Boolean dcEnd;

}
