package com.bozheng.uf.assistsystem.domain.entity.ufsystem;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jianjiawen
 * @date 2021-2-16 10:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "UA_Account")
public class UaAccount {
    @TableField(value = "iSysID")
    private String sysID;

    @TableId(value = "cAcc_Id" ,type = IdType.INPUT)
    private String accId;

    @TableField(value = "cAcc_Name")
    private String accName;

    @TableField(value = "cAcc_Path")
    private String accPath;

    @TableField(value = "iYear")
    private Short year;

    @TableField(value = "iMonth")
    private Short month;

    @TableField(value = "cAcc_Master")
    private String accMaster;

    @TableField(value = "cCurCode")
    private String curCode;

    @TableField(value = "cCurName")
    private String curName;

    @TableField(value = "cUnitName")
    private String unitName;

    @TableField(value = "cUnitAbbre")
    private String unitAbbre;

    @TableField(value = "cUnitAddr")
    private String unitAddr;

    @TableField(value = "cUnitZap")
    private String unitZap;

    @TableField(value = "cUnitTel")
    private String unitTel;

    @TableField(value = "cUnitFax")
    private String unitFax;

    @TableField(value = "cUnitEMail")
    private String unitEmail;

    @TableField(value = "cUnitTaxNo")
    private String unitTaxNo;

    @TableField(value = "cUnitLP")
    private String unitLp;

    @TableField(value = "cFinKind")
    private String finKind;

    @TableField(value = "cFinType")
    private String finType;

    @TableField(value = "cEntType")
    private String entType;

    @TableField(value = "cTradeKind")
    private String tradeKind;

    @TableField(value = "cIsCompanyVer")
    private String isCompanyVer;

    @TableField(value = "cDomain")
    private String domain;

    @TableField(value = "cOrgCode")
    private String orgCode;

    @TableField(value = "cUnitNameEn")
    private String unitNameEn;

    @TableField(value = "cUnitAddress1En")
    private String unitAddress1En;

    @TableField(value = "cUnitAddress2En")
    private String unitAddress2En;

    @TableField(value = "cUnitAddress3En")
    private String unitAddress3En;

    @TableField(value = "cUnitAddress4En")
    private String unitAddress4En;

    @TableField(value = "cCustomCode")
    private String customCode;

    @TableField(value = "cPortCode")
    private String portCode;

    @TableField(value = "cCustomBrokerCode")
    private String customBrokerCode;

    @TableField(value = "cDescription")
    private String description;

    @TableField(value = "cIndustryCode")
    private String industryCode;

    @TableField(value = "bIM")
    private Boolean im;

    @TableField(value = "bIntelligentInput")
    private Boolean intelligentInput;

    @TableField(value = "cESpaceID")
    private String eSpaceId;
}
