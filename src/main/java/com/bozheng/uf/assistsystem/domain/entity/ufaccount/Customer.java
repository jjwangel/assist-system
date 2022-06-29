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
 * @date 2021-4-13 19:44
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "Customer")
public class Customer {

    @TableId(value = "cCusCode" ,type = IdType.INPUT)
    private String cusCode;

    @TableField(value = "cCusName")
    private String cusName;

    @TableField(value = "cCusAbbName")
    private String cusAbbName;

    @TableField(value = "cCCCode")
    private String ccCode;

    @TableField(value = "cDCCode")
    private String dcCode;

    @TableField(value = "cTrade")
    private String trade;

    @TableField(value = "cCusAddress")
    private String cusAddress;

    @TableField(value = "cCusPostCode")
    private String cusPostCode;

    @TableField(value = "cCusRegCode")
    private String cusRegCode;

    @TableField(value = "cCusBank")
    private String cusBank;

    @TableField(value = "cCusAccount")
    private String cusAccount;

    @TableField(value = "cCusLPerson")
    private String cuslPerson;

    @TableField(value = "cCusEmail")
    private String cusEmail;

    @TableField(value = "cCusPerson")
    private String cusPerson;

    @TableField(value = "cCusPhone")
    private String cusPhone;

    @TableField(value = "cCusFax")
    private String cusFax;

    @TableField(value = "cCusHand")
    private String cusHand;

    @TableField(value = "iCusDisRate")
    private Float cusDisRate;

    @TableField(value = "cCusWhCode")
    private String cusWhCode;

    @TableField(value = "cCusDepart")
    private String cusDepart;

    @TableField(value = "iARMoney")
    private Float arMoney;

    @TableField(value = "dEndDate")
    private Date endDate;

    @TableField(value = "cCusDefine1")
    private String cusDefine1;

    @TableField(value = "cCusDefine2")
    private String cusDefine2;

    @TableField(value = "cCusDefine3")
    private String cusDefine3;

    @TableField(value = "cCusDefine4")
    private String cusDefine4;

    @TableField(value = "cCusDefine5")
    private String cusDefine5;

    @TableField(value = "cCusDefine6")
    private String cusDefine6;

    @TableField(value = "cCusDefine7")
    private String cusDefine7;

    @TableField(value = "cCusDefine8")
    private String cusDefine8;

    @TableField(value = "cCusDefine9")
    private String cusDefine9;

    @TableField(value = "cCusDefine10")
    private String cusDefine10;

    @TableField(value = "cCusDefine11")
    private Integer cusDefine11;

    @TableField(value = "cCusDefine12")
    private Integer cusDefine12;

    @TableField(value = "cCusDefine13")
    private Float cusDefine13;

    @TableField(value = "cCusDefine14")
    private Float cusDefine14;

    @TableField(value = "cCusDefine15")
    private Date cusDefine15;

    @TableField(value = "cCusDefine16")
    private Date cusDefine16;

    @TableField(value = "cCreatePerson")
    private String createPerson;

    @TableField(value = "cModifyPerson")
    private String modifyPerson;

    @TableField(value = "dModifyDate")
    private Date modifyDate;

    @TableField(value = "cRelVendor")
    private String relVendor;

    @TableField(value = "cInvoiceCompany")
    private String invoiceCompany;

    @TableField(value = "cMemo")
    private String memo;

    @TableField(value = "cCusBankCode")
    private String cusBankCode;

    @TableField(value = "cCusExch_name")
    private String cusExchName;

    @TableField(value = "iCusTaxRate")
    private Float cusTaxRate;

    @TableField(value = "cProvince")
    private String cProvince;

    @TableField(value = "cCity")
    private String cCity;

    @TableField(value = "cCounty")
    private String cCounty;

    /**
     *     @TableField(value = "dCusDevDate")
     *     private Date dCusDevDate;
     *
     *     @TableField(value = "cCusBP")
     *     private String cCusBP;
     *
     *     @TableField(value = "cCusPPerson")
     *     private String cCusPPerson;
     *
     *     @TableField(value = "cCusCreGrade")
     *     private String cCusCreGrade;
     *
     *     @TableField(value = "iCusCreLine")
     *     private Float iCusCreLine;
     *
     *     @TableField(value = "iCusCreDate")
     *     private Integer iCusCreDate;
     *
     *     @TableField(value = "cCusPayCond")
     *     private String cCusPayCond;
     *
     *     @TableField(value = "cCusOAddress")
     *     private String cCusOAddress;
     *
     *     @TableField(value = "cCusOType")
     *     private String cCusOType;
     *
     *     @TableField(value = "cCusHeadCode")
     *     private String cCusHeadCode;
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
     *     @TableField(value = "iCostGrade")
     *     private Short iCostGrade;
     *
     *
     *     @TableField(value = "iId")
     *     private String iId;
     *
     *     @TableField(value = "cPriceGroup")
     *     private String cPriceGroup;
     *
     *     @TableField(value = "cOfferGrade")
     *     private String cOfferGrade;
     *
     *     @TableField(value = "iOfferRate")
     *     private Float iOfferRate;
     *
     *     @TableField(value = "bCredit")
     *     private Boolean credit;
     *
     *     @TableField(value = "bCreditDate")
     *     private Boolean bCreditDate;
     *
     *     @TableField(value = "bCreditByHead")
     *     private Boolean bCreditByHead;
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
     *     @TableField(value = "bProxy")
     *     private Boolean bProxy;
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
     *     @TableField(value = "bLimitSale")
     *     private Boolean bLimitSale;
     *
     *     @TableField(value = "cCusContactCode")
     *     private String cCusContactCode;
     *
     *     @TableField(value = "cCusCountryCode")
     *     private String cCusCountryCode;
     *
     *     @TableField(value = "cCusEnName")
     *     private String cCusEnName;
     *
     *     @TableField(value = "cCusEnAddr1")
     *     private String cCusEnAddr1;
     *
     *     @TableField(value = "cCusEnAddr2")
     *     private String cCusEnAddr2;
     *
     *     @TableField(value = "cCusEnAddr3")
     *     private String cCusEnAddr3;
     *
     *     @TableField(value = "cCusEnAddr4")
     *     private String cCusEnAddr4;
     *
     *     @TableField(value = "cCusPortCode")
     *     private String cCusPortCode;
     *
     *     @TableField(value = "cPrimaryVen")
     *     private String cPrimaryVen;
     *
     *     @TableField(value = "fCommisionRate")
     *     private Float fCommisionRate;
     *
     *     @TableField(value = "fInsueRate")
     *     private Float fInsueRate;
     *
     *     @TableField(value = "bHomeBranch")
     *     private Boolean bHomeBranch;
     *
     *     @TableField(value = "cBranchAddr")
     *     private String cBranchAddr;
     *
     *     @TableField(value = "cBranchPhone")
     *     private String cBranchPhone;
     *
     *     @TableField(value = "cBranchPerson")
     *     private String cBranchPerson;
     *
     *     @TableField(value = "cCusTradeCCode")
     *     private String cCusTradeCCode;
     *
     *     @TableField(value = "CustomerKCode")
     *     private String CustomerKCode;
     *
     *     @TableField(value = "bCusState")
     *     private Boolean bCusState;
     *
     *     @TableField(value = "bShop")
     *     private Short bShop;
     *
     *     @TableField(value = "iCusGSPType")
     *     private Short iCusGSPType;
     *
     *     @TableField(value = "iCusGSPAuth")
     *     private Short iCusGSPAuth;
     *
     *     @TableField(value = "cCusGSPAuthNo")
     *     private String cCusGSPAuthNo;
     *
     *     @TableField(value = "cCusBusinessNo")
     *     private String cCusBusinessNo;
     *
     *     @TableField(value = "cCusLicenceNo")
     *     private String cCusLicenceNo;
     *
     *     @TableField(value = "bCusDomestic")
     *     private Boolean bCusDomestic;
     *
     *     @TableField(value = "bCusOverseas")
     *     private Boolean bCusOverseas;
     *
     *     @TableField(value = "cCusCreditCompany")
     *     private String cCusCreditCompany;
     *
     *     @TableField(value = "cCusSAProtocol")
     *     private String cCusSAProtocol;
     *
     *     @TableField(value = "cCusExProtocol")
     *     private String cCusExProtocol;
     *
     *     @TableField(value = "cCusOtherProtocol")
     *     private String cCusOtherProtocol;
     *
     *     @TableField(value = "fCusDiscountRate")
     *     private Float fCusDiscountRate;
     *
     *     @TableField(value = "cCusSSCode")
     *     private String cCusSSCode;
     *
     *     @TableField(value = "cCusCMProtocol")
     *     private String cCusCMProtocol;
     *
     *     @TableField(value = "dCusCreateDatetime")
     *     private Date dCusCreateDatetime;
     *
     *     @TableField(value = "cCusAppDocNo")
     *     private String cCusAppDocNo;
     *
     *     @TableField(value = "cCusMnemCode")
     *     private String cCusMnemCode;
     *
     *     @TableField(value = "fAdvancePaymentRatio")
     *     private Float fAdvancePaymentRatio;
     *
     *     @TableField(value = "bServiceAttribute")
     *     private Boolean bServiceAttribute;
     *
     *     @TableField(value = "bRequestSign")
     *     private Boolean bRequestSign;
     *
     *     @TableField(value = "bOnGPinStore")
     *     private Boolean bOnGPinStore;
     *
     *     @TableField(value = "cCusMngTypeCode")
     *     private String cCusMngTypeCode;
     *
     *     @TableField(value = "account_type")
     *     private BigDecimal accountType;
     *
     *     @TableField(value = "cCusImAgentProtocol")
     *     private String cCusImAgentProtocol;
     *
     *     @TableField(value = "iSourceType")
     *     private Short iSourceType;
     *
     *     @TableField(value = "iSourceId")
     *     private String iSourceId;
     *
     *     @TableField(value = "fExpense")
     *     private Float fExpense;
     *
     *     @TableField(value = "fApprovedExpense")
     *     private Float fApprovedExpense;
     *
     *     @TableField(value = "dTouchedTime")
     *     private Date dTouchedTime;
     *
     *     @TableField(value = "dRecentlyInvoiceTime")
     *     private Date dRecentlyInvoiceTime;
     *
     *     @TableField(value = "dRecentlyQuoteTime")
     *     private Date dRecentlyQuoteTime;
     *
     *     @TableField(value = "dRecentlyActivityTime")
     *     private Date dRecentlyActivityTime;
     *
     *     @TableField(value = "dRecentlyChanceTime")
     *     private Date dRecentlyChanceTime;
     *
     *     @TableField(value = "dRecentlyContractTime")
     *     private Date dRecentlyContractTime;
     *
     *     @TableField(value = "cLtcCustomerCode")
     *     private String cLtcCustomerCode;
     *
     *     @TableField(value = "bTransFlag")
     *     private Boolean bTransFlag;
     *
     *     @TableField(value = "cLtcPerson")
     *     private String cLtcPerson;
     *
     *     @TableField(value = "dLtcDate")
     *     private Date dLtcDate;
     *
     *     @TableField(value = "cLocationSite")
     *     private String cLocationSite;
     *
     *     @TableField(value = "cCusAddressGUID")
     *     private String cCusAddressGUID;
     *
     *     @TableField(value = "cAddCode")
     *     private String cAddCode;
     *
     *     @TableField(value = "alloct_dept_time")
     *     private Date alloctDeptTime;
     *
     *     @TableField(value = "allot_user_time")
     *     private Date allotUserTime;
     *
     *     @TableField(value = "recyle_dept_time")
     *     private Date recyleDeptTime;
     *
     *     @TableField(value = "recyle_pub_time")
     *     private Date recylePubTime;
     *
     *     @TableField(value = "cLicenceNo")
     *     private String cLicenceNo;
     *
     *     @TableField(value = "cLicenceRange")
     *     private String cLicenceRange;
     *
     *     @TableField(value = "cCusBusinessRange")
     *     private String cCusBusinessRange;
     *
     *     @TableField(value = "cCusGSPAuthRange")
     *     private String cCusGSPAuthRange;
     *
     *     @TableField(value = "dCusGSPEDate")
     *     private Date dCusGSPEDate;
     *
     *     @TableField(value = "dCusGSPSDate")
     *     private Date dCusGSPSDate;
     *
     *     @TableField(value = "iCusGSPADays")
     *     private Integer iCusGSPADays;
     *
     *     @TableField(value = "bIsCusAttachFile")
     *     private Boolean bIsCusAttachFile;
     *
     *     @TableField(value = "dRecentContractDate")
     *     private Date dRecentContractDate;
     *
     *     @TableField(value = "dRecentDeliveryDate")
     *     private Date dRecentDeliveryDate;
     *
     *     @TableField(value = "dRecentOutboundDate")
     *     private Date dRecentOutboundDate;
     */
}
