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
 * @date 2021-4-17 16:39
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "Department")
public class Department {

    @TableId(value = "cDepCode" ,type = IdType.INPUT)
    private String depCode;

    @TableField(value = "cDepName")
    private String depName;

    @TableField(value = "iDepGrade")
    private Byte depGrade;

    @TableField(value = "bDepEnd")
    private Boolean depEnd;

    @TableField(value = "cDepPerson")
    private String depPerson;

    @TableField(value = "cDepProp")
    private String depProp;

    @TableField(value = "cDepPhone")
    private String depPhone;

    @TableField(value = "cDepAddress")
    private String depAddress;

    @TableField(value = "cDepMemo")
    private String depMemo;

    @TableField(value = "cDepGUID")
    private String depGuid;

    @TableField(value = "cDepFax")
    private String depFax;

    @TableField(value = "cDepPostCode")
    private String depPostCode;

    @TableField(value = "cDepEmail")
    private String depEmail;

    @TableField(value = "cDepType")
    private String depType;

    @TableField(value = "cDepFullName")
    private String depFullName;

    @TableField(value = "iDepOrder")
    private Integer depOrder;

    @TableField(value = "cDepLeader")
    private String depLeader;

    @TableField(value = "iCreLine")
    private Float creLine;

    @TableField(value = "cCreGrade")
    private String creGrade;

    @TableField(value = "iCreDate")
    private Integer creDate;

    @TableField(value = "cOfferGrade")
    private String offerGrade;

    @TableField(value = "iOfferRate")
    private Float offerRate;

    @TableField(value = "bShop")
    private Boolean shop;

    @TableField(value = "dDepBeginDate")
    private Date depBeginDate;

    @TableField(value = "dDepEndDate")
    private Date depEndDate;

    @TableField(value = "vAuthorizeDoc")
    private String authorizeDoc;

    @TableField(value = "vAuthorizeUnit")
    private String authorizeUnit;

    @TableField(value = "bInheritDutyBasic")
    private Integer inheritDutyBasic;

    @TableField(value = "bInheritWorkCalendar")
    private Integer inheritWorkCalendar;

    @TableField(value = "cDutyCode")
    private String dutyCode;

    @TableField(value = "cRestCode")
    private String restCode;

    @TableField(value = "bIM")
    private Boolean im;

    @TableField(value = "cDepNameEn")
    private String depNameEn;

    @TableField(value = "bRetail")
    private Boolean retail;

    @TableField(value = "dModifyDate")
    private Date modifyDate;

}
