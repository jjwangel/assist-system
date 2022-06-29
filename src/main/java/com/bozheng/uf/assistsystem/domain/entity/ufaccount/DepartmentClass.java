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
 * @date 2021-4-17 16:00
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "Department")
public class DepartmentClass {

    @TableId(value = "cDepCode" ,type = IdType.INPUT)
    private String depCode ;

    @TableField(value = "cDepName")
    private String depName;

    @TableField(value = "iDepGrade")
    private Byte depGrade;

    @TableField(value = "bDepEnd")
    private Boolean depEnd;

}
