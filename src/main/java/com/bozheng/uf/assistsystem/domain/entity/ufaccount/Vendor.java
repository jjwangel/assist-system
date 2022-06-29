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
 * 供应商档案
 * @author jianjiawen
 * @date 2021-4-14 19:58
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "Vendor")
public class Vendor {

    @TableId(value = "cVenCode" ,type = IdType.INPUT)
    private String venCode;

    @TableField(value = "cVenName")
    private String venName;

    @TableField(value = "cVenAbbName")
    private String venAbbName;

    @TableField(value = "cVCCode")
    private String vcCode;

    @TableField(value = "cDCCode")
    private String dcCode;

    @TableField(value = "cTrade")
    private String trade;

    @TableField(value = "cVenAddress")
    private String venAddress;

    @TableField(value = "cVenPostCode")
    private String venPostCode;

    @TableField(value = "cVenRegCode")
    private String venRegCode;

    @TableField(value = "cVenBank")
    private String venBank;

    @TableField(value = "cVenAccount")
    private String venAccount;

    @TableField(value = "dVenDevDate")
    private Date venDevDate;

    @TableField(value = "cVenLPerson")
    private String venlPerson;

    @TableField(value = "cVenPhone")
    private String venPhone;

    @TableField(value = "cVenFax")
    private String venFax;

    @TableField(value = "cVenEmail")
    private String venEmail;

    @TableField(value = "cVenPerson")
    private String venPerson;

    @TableField(value = "cVenHand")
    private String venHand;

    @TableField(value = "iVenDisRate")
    private Float venDisRate;

    @TableField(value = "cVenWhCode")
    private String venWhCode;

    @TableField(value = "iAPMoney")
    private Float apMoney;

    @TableField(value = "cVenDepart")
    private String venDepart;

    @TableField(value = "dEndDate")
    private Date endDate;

    @TableField(value = "cVenDefine1")
    private String cVenDefine1;

    @TableField(value = "cVenDefine2")
    private String cVenDefine2;

    @TableField(value = "cVenDefine3")
    private String cVenDefine3;

    @TableField(value = "cVenDefine4")
    private String cVenDefine4;

    @TableField(value = "cVenDefine5")
    private String cVenDefine5;

    @TableField(value = "cVenDefine6")
    private String cVenDefine6;

    @TableField(value = "cVenDefine7")
    private String cVenDefine7;

    @TableField(value = "cVenDefine8")
    private String cVenDefine8;

    @TableField(value = "cVenDefine9")
    private String cVenDefine9;

    @TableField(value = "cVenDefine10")
    private String cVenDefine10;

    @TableField(value = "cVenDefine11")
    private Integer cVenDefine11;

    @TableField(value = "cVenDefine12")
    private Integer cVenDefine12;

    @TableField(value = "cVenDefine13")
    private Float cVenDefine13;

    @TableField(value = "cVenDefine14")
    private Float cVenDefine14;

    @TableField(value = "cVenDefine15")
    private Date cVenDefine15;

    @TableField(value = "cVenDefine16")
    private Date cVenDefine16;

    @TableField(value = "cCreatePerson")
    private String createPerson;

    @TableField(value = "cModifyPerson")
    private String modifyPerson;

    @TableField(value = "dModifyDate")
    private Date modifyDate;

    @TableField(value = "cRelCustomer")
    private String relCustomer;

    @TableField(value = "cMemo")
    private String memo;

    @TableField(value = "cVenBankCode")
    private String venBankCode;

    @TableField(value = "cVenExch_name")
    private String venExchName;

    @TableField(value = "iVenTaxRate")
    private Float venTaxRate;

    /**
     *
     *     @TableField(value = "cVenBP")
     *     private String cVenBP;
     *
     *     @TableField(value = "cVenPPerson")
     *     private String cVenPPerson;
     *
     *     @TableField(value = "iVenCreGrade")
     *     private String iVenCreGrade;
     *
     *     @TableField(value = "iVenCreLine")
     *     private Float iVenCreLine;
     *
     *     @TableField(value = "iVenCreDate")
     *     private Integer iVenCreDate;
     *
     *     @TableField(value = "cVenPayCond")
     *     private String cVenPayCond;
     *
     *     @TableField(value = "cVenIAddress")
     *     private String cVenIAddress;
     *
     *     @TableField(value = "cVenIType")
     *     private String cVenIType;
     *
     *     @TableField(value = "cVenHeadCode")
     *     private String cVenHeadCode;
     *
     *     @TableField(value = "dLastDate")
     *     private Date dLastDate;
     *
     *     @TableField(value = "iLastMoney")
     *     private Float iLastMoney;
     *
     *     @TableField(value = "dLRDate")
     *     private Date dLRDate;
     *
     *     @TableField(value = "iLRMoney")
     *     private Float iLRMoney;
     *
     *     @TableField(value = "iFrequency")
     *     private Integer iFrequency;
     *
     *     @TableField(value = "bVenTax")
     *     private Boolean bVenTax;
     *
     *     @TableField(value = "iId")
     *     private Integer iId;
     *
     *     @TableField(value = "cBarCode")
     *     private String cBarCode;
     *
     *     @TableField(value = "pubufts")
     *     private Date pubufts;
     *
     *     @TableField(value = "fRegistFund")
     *     private Float fRegistFund;
     *
     *     @TableField(value = "iEmployeeNum")
     *     private Integer iEmployeeNum;
     *
     *     @TableField(value = "iGradeABC")
     *     private Short iGradeABC;
     *
     *     @TableField(value = "bLicenceDate")
     *     private Boolean bLicenceDate;
     *
     *     @TableField(value = "dLicenceSDate")
     *     private Date dLicenceSDate;
     *
     *     @TableField(value = "dLicenceEDate")
     *     private Date dLicenceEDate;
     *
     *     @TableField(value = "iLicenceADays")
     *     private Integer iLicenceADays;
     *
     *     @TableField(value = "bBusinessDate")
     *     private Boolean bBusinessDate;
     *
     *     @TableField(value = "dBusinessSDate")
     *     private Date dBusinessSDate;
     *
     *     @TableField(value = "dBusinessEDate")
     *     private Date dBusinessEDate;
     *
     *     @TableField(value = "iBusinessADays")
     *     private Integer iBusinessADays;
     *
     *     @TableField(value = "bProxyDate")
     *     private Boolean bProxyDate;
     *
     *     @TableField(value = "dProxySDate")
     *     private Date dProxySDate;
     *
     *     @TableField(value = "dProxyEDate")
     *     private Date dProxyEDate;
     *
     *     @TableField(value = "iProxyADays")
     *     private Integer iProxyADays;
     *
     *     @TableField(value = "bPassGMP")
     *     private Boolean bPassGMP;
     *
     *     @TableField(value = "bVenCargo")
     *     private Boolean bVenCargo;
     *
     *     @TableField(value = "bProxyForeign")
     *     private Boolean bProxyForeign;
     *
     *     @TableField(value = "bVenService")
     *     private Boolean bVenService;
     *
     *     @TableField(value = "cVenTradeCCode")
     *     private String cVenTradeCCode;
     *
     *     @TableField(value = "iVenGSPType")
     *     private Short iVenGSPType;
     *
     *     @TableField(value = "iVenGSPAuth")
     *     private Short iVenGSPAuth;
     *
     *     @TableField(value = "cVenGSPAuthNo")
     *     private String cVenGSPAuthNo;
     *
     *     @TableField(value = "cVenBusinessNo")
     *     private String cVenBusinessNo;
     *
     *     @TableField(value = "cVenLicenceNo")
     *     private String cVenLicenceNo;
     *
     *     @TableField(value = "bVenOverseas")
     *     private Boolean bVenOverseas;
     *
     *     @TableField(value = "bVenAccPeriodMng")
     *     private Boolean bVenAccPeriodMng;
     *
     *     @TableField(value = "cVenPUOMProtocol")
     *     private String cVenPUOMProtocol;
     *
     *     @TableField(value = "cVenOtherProtocol")
     *     private String cVenOtherProtocol;
     *
     *     @TableField(value = "cVenCountryCode")
     *     private String cVenCountryCode;
     *
     *     @TableField(value = "cVenEnName")
     *     private String cVenEnName;
     *
     *     @TableField(value = "cVenEnAddr1")
     *     private String cVenEnAddr1;
     *
     *     @TableField(value = "cVenEnAddr2")
     *     private String cVenEnAddr2;
     *
     *     @TableField(value = "cVenEnAddr3")
     *     private String cVenEnAddr3;
     *
     *     @TableField(value = "cVenEnAddr4")
     *     private String cVenEnAddr4;
     *
     *     @TableField(value = "cVenPortCode")
     *     private String cVenPortCode;
     *
     *     @TableField(value = "cVenPrimaryVen")
     *     private String cVenPrimaryVen;
     *
     *     @TableField(value = "fVenCommisionRate")
     *     private Float fVenCommisionRate;
     *
     *     @TableField(value = "fVenInsueRate")
     *     private Float fVenInsueRate;
     *
     *     @TableField(value = "bVenHomeBranch")
     *     private Boolean bVenHomeBranch;
     *
     *     @TableField(value = "cVenBranchAddr")
     *     private String cVenBranchAddr;
     *
     *     @TableField(value = "cVenBranchPhone")
     *     private String cVenBranchPhone;
     *
     *     @TableField(value = "cVenBranchPerson")
     *     private String cVenBranchPerson;
     *
     *     @TableField(value = "cVenSSCode")
     *     private String cVenSSCode;
     *
     *     @TableField(value = "cOMWhCode")
     *     private String cOMWhCode;
     *
     *     @TableField(value = "cVenCMProtocol")
     *     private String cVenCMProtocol;
     *
     *     @TableField(value = "cVenIMProtocol")
     *     private String cVenIMProtocol;
     *
     *     @TableField(value = "dVenCreateDatetime")
     *     private Date dVenCreateDatetime;
     *
     *     @TableField(value = "cVenMnemCode")
     *     private String cVenMnemCode;
     *
     *     @TableField(value = "cVenContactCode")
     *     private String cVenContactCode;
     *
     *     @TableField(value = "cvenbankall")
     *     private String cvenbankall;
     *
     *     @TableField(value = "bIsVenAttachFile")
     *     private Boolean bIsVenAttachFile;
     *
     *     @TableField(value = "cLicenceRange")
     *     private String cLicenceRange;
     *
     *     @TableField(value = "cBusinessRange")
     *     private String cBusinessRange;
     *
     *     @TableField(value = "cVenGSPRange")
     *     private String cVenGSPRange;
     *
     *     @TableField(value = "dVenGSPEDate")
     *     private Date dVenGSPEDate;
     *
     *     @TableField(value = "dVenGSPSDate")
     *     private Date dVenGSPSDate;
     *
     *     @TableField(value = "iVenGSPADays")
     *     private Integer iVenGSPADays;
     *
     */

}
