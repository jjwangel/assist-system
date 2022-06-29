package com.bozheng.uf.assistsystem.domain.entity.ufaccount;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author jianjiawen
 * @date 2021-4-18 14:55
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "Person")
public class Person {

    @TableId(value = "cPersonCode" ,type = IdType.INPUT)
    private String personCode;

    @TableField(value = "cPersonName")
    private String personName;

    @TableField(value = "cDepCode")
    private String depCode;

    @TableField(value = "cPersonProp")
    private String personProp;

    @TableField(value = "fCreditQuantity")
    private Float creditQuantity;

    @TableField(value = "iCreDate")
    private Integer creDate;

    @TableField(value = "cCreGrade")
    private String creGrade;

    @TableField(value = "iLowRate")
    private Float lowRate;

    @TableField(value = "cOfferGrade")
    private String offerGrade;

    @TableField(value = "iOfferRate")
    private Float offerRate;

    @TableField(value = "cPersonEmail")
    private String personEmail;

    @TableField(value = "cPersonPhone")
    private String personPhone;

    @TableField(value = "dPValidDate")
    private Date validDate;

    @TableField(value = "dPInValidDate")
    private Date inValidDate;
}
