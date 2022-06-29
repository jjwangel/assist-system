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
 * 仓库档案
 * @author jianjiawen
 * @date 2021-4-17 11:57
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "Warehouse")
public class Warehouse {
    @TableId(value = "cWhCode" ,type = IdType.INPUT)
    private String whCode;

    @TableField(value = "cWhName")
    private String whName;

    @TableField(value = "cDepCode")
    private String depCode;

    @TableField(value = "cWhAddress")
    private String whAddress;

    @TableField(value = "cWhPhone")
    private String whPhone;

    @TableField(value = "cWhPerson")
    private String whPerson;

    @TableField(value = "cWhValueStyle")
    private String whValueStyle;

    @TableField(value = "bWhPos")
    private Boolean whPos;

    @TableField(value = "iWhFundQuota")
    private Float whFundQuota;

    @TableField(value = "cMonth")
    private String month;

    @TableField(value = "cWhMemo")
    private String whMemo;

    @TableField(value = "bFreeze")
    private Boolean freeze;

    @TableField(value = "cBarCode")
    private String barCode;

    @TableField(value = "bMRP")
    private Boolean mrp;

    @TableField(value = "bROP")
    private Boolean rop;

    @TableField(value = "iFrequency")
    private Short frequency;

    @TableField(value = "cFrequency")
    private String frequencyUnit;

    @TableField(value = "iDays")
    private Short days;

    @TableField(value = "dLastDate")
    private Date lastDate;

    @TableField(value = "iWHProperty")
    private Short whProperty;

    @TableField(value = "bShop")
    private Boolean shop;

    @TableField(value = "bControlSerial")
    private Boolean controlSerial;

    @TableField(value = "bInCost")
    private Boolean inCost;

    @TableField(value = "bInAvailCalcu")
    private Boolean inAvailCalcu;

    @TableField(value = "bProxyWh")
    private Boolean proxyWh;

    @TableField(value = "iSAConMode")
    private Short saConMode;

    @TableField(value = "iEXConMode")
    private Short exConMode;

    @TableField(value = "iSTConMode")
    private Short stConMode;

    @TableField(value = "bBondedWh")
    private Boolean bondedWh;

    @TableField(value = "bWhAsset")
    private Boolean whAsset;

    @TableField(value = "fWhQuota")
    private Float whQuota;

    @TableField(value = "dWhEndDate")
    private Date whEndDate;

    @TableField(value = "bCheckSubitemCost")
    private Boolean checkSubitemCost;

    @TableField(value = "cPickPos")
    private String pickPos;

    @TableField(value = "bEB")
    private Boolean eb;

    @TableField(value = "dModifyDate")
    private Date modifyDate;

    @TableField(value = "cWareGroupCode")
    private String wareGroupCode;

    @TableField(value = "cProvince")
    private String province;

    @TableField(value = "cCity")
    private String city;

    @TableField(value = "cCounty")
    private String county;
}
