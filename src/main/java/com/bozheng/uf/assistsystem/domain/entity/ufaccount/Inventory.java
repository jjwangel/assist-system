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
 * @date 2021-2-27 11:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "Inventory")
public class Inventory {

    @TableId(value = "cInvCode" ,type = IdType.INPUT)
    private String invCode;

    @TableField(value = "cInvAddCode")
    private String invAddCode;

    @TableField(value = "cInvName")
    private String invName;

    @TableField(value = "cInvStd")
    private String invStd;

    @TableField(value = "cInvCCode")
    private String invcCode;

    @TableField(value = "cVenCode")
    private String venCode;

    @TableField(value = "iGroupType")
    private Byte groupType;

    @TableField(value = "cGroupCode")
    private String groupCode;

    @TableField(value = "cComUnitCode")
    private String comUnitCode;

    @TableField(value = "cAssComUnitCode")
    private String assComUnitCode;

    @TableField(value = "cSAComUnitCode")
    private String saComUnitCode;

    @TableField(value = "cPUComUnitCode")
    private String puComUnitCode;

    @TableField(value = "cSTComUnitCode")
    private String stComUnitCode;

    @TableField(value = "cCAComUnitCode")
    private String caComUnitCode;

    @TableField(value = "cDefWareHouse")
    private String defWareHouse;

    @TableField(value = "bProxyForeign")
    private Boolean proxyForeign;

    @TableField(value = "bCheckItem")
    private Boolean checkItem;

    @TableField(value = "cProductUnit")
    private String productUnit;

    @TableField(value = "fRetailPrice")
    private Float retailPrice;

    @TableField(value = "cInvDepCode")
    private String invDepCode;

    @TableField(value = "cEngineerFigNo")
    private String engineerFigNo;

    @TableField(value = "fLength")
    private Float length;

    @TableField(value = "fWidth")
    private Float width;

    @TableField(value = "fHeight")
    private Float height;

    @TableField(value = "bSale")
    private Boolean sale;

    @TableField(value = "bPurchase")
    private Boolean purchase;

    @TableField(value = "bSelf")
    private Boolean self;

    @TableField(value = "bComsume")
    private Boolean comsume;

    @TableField(value = "bProducing")
    private Boolean producing;

    @TableField(value = "bService")
    private Boolean service;

    @TableField(value = "bAccessary")
    private Boolean accessary;

    @TableField(value = "iTaxRate")
    private Float taxRate;

    @TableField(value = "iInvRCost")
    private Float invRcost;

    @TableField(value = "iInvSPrice")
    private Float invSprice;

    @TableField(value = "iInvSCost")
    private Float invScost;

    @TableField(value = "iInvLSCost")
    private Float invLsCost;

    @TableField(value = "iInvNCost")
    private Float invNcost;

    @TableField(value = "dSDate")
    private Date sDate;

    @TableField(value = "dEDate")
    private Date eDate;

    @TableField(value = "bFree1")
    private Boolean free1;

    @TableField(value = "bFree2")
    private Boolean free2;

    @TableField(value = "bFree3")
    private Boolean free3;

    @TableField(value = "bFree4")
    private Boolean free4;

    @TableField(value = "bFree5")
    private Boolean free5;

    @TableField(value = "bFree6")
    private Boolean free6;

    @TableField(value = "bFree7")
    private Boolean free7;

    @TableField(value = "bFree8")
    private Boolean free8;

    @TableField(value = "bFree9")
    private Boolean free9;

    @TableField(value = "bFree10")
    private Boolean free10;

    @TableField(value = "cInvDefine1")
    private String invDefine1;

    @TableField(value = "cInvDefine2")
    private String invDefine2;

    @TableField(value = "cInvDefine3")
    private String invDefine3;

    @TableField(value = "cInvDefine4")
    private String invDefine4;

    @TableField(value = "cInvDefine5")
    private String invDefine5;

    @TableField(value = "cInvDefine6")
    private String invDefine6;

    @TableField(value = "cInvDefine7")
    private String invDefine7;

    @TableField(value = "cInvDefine8")
    private String invDefine8;

    @TableField(value = "cInvDefine9")
    private String invDefine9;

    @TableField(value = "cInvDefine10")
    private String invDefine10;

    @TableField(value = "cInvDefine11")
    private Integer invDefine11;

    @TableField(value = "cInvDefine12")
    private Integer invDefine12;

    @TableField(value = "cInvDefine13")
    private Float invDefine13;

    @TableField(value = "cInvDefine14")
    private Float invDefine14;

    @TableField(value = "cInvDefine15")
    private Date invDefine15;

    @TableField(value = "cInvDefine16")
    private Date invDefine16;

    @TableField(value = "I_id")
    private Integer iid2;

    @TableField(value = "iId")
    private Integer iid1;

    @TableField(value = "bInvType")
    private Boolean invType;

    @TableField(value = "iInvSaleCost")
    private Float invSaleCost;

    @TableField(value = "cCreatePerson")
    private String createPerson;

    @TableField(value = "cModifyPerson")
    private String modifyPerson;

    @TableField(value = "dModifyDate")
    private Date modifyDate;

    @TableField(value = "bFixExch")
    private Boolean fixExch;

    @TableField(value = "fExpensesExch")
    private Float expensesExch;

    @TableField(value = "bTrack")
    private Boolean track;

    @TableField(value = "bSerial")
    private Boolean serial;

    @TableField(value = "bBarCode")
    private Boolean bBarCode;

    @TableField(value = "cBarCode")
    private String cBarCode;

    @TableField(value = "iImpTaxRate")
    private Float impTaxRate;

    @TableField(value = "bBomMain")
    private Boolean bomMain;

    @TableField(value = "bProductBill")
    private Boolean productBill;

    @TableField(value = "bExpSale")
    private Boolean expSale;



    // 暂时没用字段
//    @TableField(value = "cReplaceItem")
//    private String replaceItem;
//
//    @TableField(value = "cPosition")
//    private String position;
//
//    @TableField(value = "iInvWeight")
//    private Float invWeight;
//
//    @TableField(value = "iVolume")
//    private Float volume;
//
//    @TableField(value = "iInvAdvance")
//    private Float invAdvance;
//
//    @TableField(value = "iInvBatch")
//    private Float iInvBatch;
//
//    @TableField(value = "iSafeNum")
//    private Float safeNum;
//
//    @TableField(value = "iTopSum")
//    private Float topSum;
//
//    @TableField(value = "iLowSum")
//    private Float lowSum;
//
//    @TableField(value = "iOverStock")
//    private Float overStock;
//
//    @TableField(value = "cInvABC")
//    private String invAbc;
//
//    @TableField(value = "bInvQuality")
//    private Boolean invQuality;
//
//    @TableField(value = "bInvBatch")
//    private Boolean bInvBatch;
//
//    @TableField(value = "bInvEntrust")
//    private Boolean invEntrust;
//
//    @TableField(value = "bInvOverStock")
//    private Boolean invOverStock;
//
//    @TableField(value = "iInvMPCost")
//    private Float invMpCost;
//
//    @TableField(value = "cQuality")
//    private String quality;
//
//    @TableField(value = "iInvSCost1")
//    private Float invScost1;
//
//    @TableField(value = "iInvSCost2")
//    private Float invScost2;
//
//    @TableField(value = "iInvSCost3")
//    private Float invScost3;
//
//    @TableField(value = "fSubscribePoint")
//    private Float subscribePoint;
//
//    @TableField(value = "fVagQuantity")
//    private Float vagQuantity;
//
//    @TableField(value = "cValueType")
//    private String valueType;
//
//    @TableField(value = "fOutExcess")
//    private Float outExcess;
//
//    @TableField(value = "fInExcess")
//    private Float inExcess;
//
//    @TableField(value = "iMassDate")
//    private Short massDate;
//
//    @TableField(value = "iWarnDays")
//    private Short warnDays;
//
//    @TableField(value = "cFrequency")
//    private String cFrequency;
//
//    @TableField(value = "iFrequency")
//    private Short iFrequency;
//
//    @TableField(value = "iDays")
//    private Short days;
//
//    @TableField(value = "dLastDate")
//    private Date lastDate;
//
//    @TableField(value = "iWastage")
//    private Float wastage;
//
//    @TableField(value = "bSolitude")
//    private Boolean solitude;
//
//    @TableField(value = "cEnterprise")
//    private String enterprise;
//
//    @TableField(value = "cAddress")
//    private String address;
//
//    @TableField(value = "cFile")
//    private String file;
//
//    @TableField(value = "cLabel")
//    private String label;
//
//    @TableField(value = "cCheckOut")
//    private String checkOut;
//
//    @TableField(value = "cLicence")
//    private String licence;
//
//    @TableField(value = "bSpecialties")
//    private Boolean specialties;
//
//    @TableField(value = "iHighPrice")
//    private Float highPrice;
//
//    @TableField(value = "iExpSaleRate")
//    private Float expSaleRate;
//
//    @TableField(value = "cPriceGroup")
//    private String priceGroup;
//
//    @TableField(value = "cOfferGrade")
//    private String offerGrade;
//
//    @TableField(value = "iOfferRate")
//    private Float offerRate;
//
//    @TableField(value = "cMonth")
//    private String month;
//
//    @TableField(value = "iAdvanceDate")
//    private Short advanceDate;
//
//    @TableField(value = "cCurrencyName")
//    private String currencyName;
//
//    @TableField(value = "cProduceAddress")
//    private String produceAddress;
//
//    @TableField(value = "cProduceNation")
//    private String produceNation;
//
//    @TableField(value = "cRegisterNo")
//    private String registerNo;
//
//    @TableField(value = "cEnterNo")
//    private String enterNo;
//
//    @TableField(value = "cPackingType")
//    private String packingType;
//
//    @TableField(value = "cEnglishName")
//    private String englishName;
//
//    @TableField(value = "bPropertyCheck")
//    private Boolean propertyCheck;
//
//    @TableField(value = "cPreparationType")
//    private String preparationType;
//
//    @TableField(value = "cCommodity")
//    private String commodity;
//
//    @TableField(value = "iRecipeBatch")
//    private Byte recipeBatch;
//
//    @TableField(value = "cNotPatentName")
//    private String notPatentName;
//
//    @TableField(value = "pubufts")
//    private Date pubufts;
//
//    @TableField(value = "bPromotSales")
//    private Boolean promotSales;
//
//    @TableField(value = "iPlanPolicy")
//    private Short planPolicy;
//
//    @TableField(value = "iROPMethod")
//    private Short ropMethod;
//
//    @TableField(value = "iBatchRule")
//    private Short batchRule;
//
//    @TableField(value = "fBatchIncrement")
//    private Float batchIncrement;
//
//    @TableField(value = "iAssureProvideDays")
//    private Integer assureProvideDays;
//
//    @TableField(value = "iTestStyle")
//    private Short testStyle;
//
//    @TableField(value = "iDTMethod")
//    private Short dtMethod;
//
//    @TableField(value = "fDTRate")
//    private Float dtRate;
//
//    @TableField(value = "fDTNum")
//    private Float dtNum;
//
//    @TableField(value = "cDTUnit")
//    private String dtUnit;
//
//    @TableField(value = "iDTStyle")
//    private Short dtStyle;
//
//    @TableField(value = "iQTMethod")
//    private Integer qtMethod;
//
//    @TableField(value = "PictureGUID")
//    private String pictureGuid;
//
//    @TableField(value = "bPlanInv")
//    private Boolean planInv;
//
//    @TableField(value = "bATOModel")
//    private Boolean atoModel;
//
//    @TableField(value = "bPTOModel")
//    private Boolean ptoModel;
//
//    @TableField(value = "bEquipment")
//    private Boolean equipment;
//
//    @TableField(value = "fOrderUpLimit")
//    private Float orderUpLimit;
//
//    @TableField(value = "cMassUnit")
//    private Short massUnit;
//
//    @TableField(value = "iAlterAdvance")
//    private Integer alterAdvance;
//
//    @TableField(value = "fAlterBaseNum")
//    private Float alterBaseNum;
//
//    @TableField(value = "cPlanMethod")
//    private String planMethod;
//
//    @TableField(value = "bMPS")
//    private Boolean mps;
//
//    @TableField(value = "bROP")
//    private Boolean rop;
//
//    @TableField(value = "bRePlan")
//    private Boolean rePlan;
//
//    @TableField(value = "cSRPolicy")
//    private String srPolicy;
//
//    @TableField(value = "bBillUnite")
//    private Boolean billUnite;
//
//    @TableField(value = "iSupplyDay")
//    private Integer supplyDay;
//
//    @TableField(value = "fSupplyMulti")
//    private Float supplyMulti;
//
//    @TableField(value = "fMinSupply")
//    private Float minSupply;
//
//    @TableField(value = "bCutMantissa")
//    private Boolean cutMantissa;
//
//    @TableField(value = "cInvPersonCode")
//    private String invPersonCode;
//
//    @TableField(value = "iInvTfId")
//    private Integer invTfId;
//
//    @TableField(value = "bInTotalCost")
//    private Boolean inTotalCost;
//
//    @TableField(value = "iSupplyType")
//    private Short supplyType;
//
//    @TableField(value = "bConfigFree1")
//    private Boolean configFree1;
//
//    @TableField(value = "bConfigFree2")
//    private Boolean configFree2;
//
//    @TableField(value = "bConfigFree3")
//    private Boolean configFree3;
//
//    @TableField(value = "bConfigFree4")
//    private Boolean configFree4;
//
//    @TableField(value = "bConfigFree5")
//    private Boolean configFree5;
//
//    @TableField(value = "bConfigFree6")
//    private Boolean configFree6;
//
//    @TableField(value = "bConfigFree7")
//    private Boolean configFree7;
//
//    @TableField(value = "bConfigFree8")
//    private Boolean configFree8;
//
//    @TableField(value = "bConfigFree9")
//    private Boolean configFree9;
//
//    @TableField(value = "bConfigFree10")
//    private Boolean configFree10;
//
//    @TableField(value = "iDTLevel")
//    private Short dtLevel;
//
//    @TableField(value = "cDTAQL")
//    private String dtAql;
//
//    @TableField(value = "bPeriodDT")
//    private Boolean periodDt;
//
//    @TableField(value = "cDTPeriod")
//    private String dtPeriod;
//
//    @TableField(value = "iBigMonth")
//    private Integer bigMonth;
//
//    @TableField(value = "iBigDay")
//    private Integer bigDay;
//
//    @TableField(value = "iSmallMonth")
//    private Integer smallMonth;
//
//    @TableField(value = "iSmallDay")
//    private Integer smallDay;
//
//    @TableField(value = "bOutInvDT")
//    private Boolean outInvDt;
//
//    @TableField(value = "bBackInvDT")
//    private Boolean backInvDt;
//
//    @TableField(value = "iEndDTStyle")
//    private Short endDtStyle;
//
//    @TableField(value = "bDTWarnInv")
//    private Boolean dtWarnInv;
//
//    @TableField(value = "fBackTaxRate")
//    private Float backTaxRate;
//
//    @TableField(value = "cCIQCode")
//    private String cIqCode;
//
//    @TableField(value = "cWGroupCode")
//    private String wGroupCode;
//
//    @TableField(value = "cWUnit")
//    private String wUnit;
//
//    @TableField(value = "fGrossW")
//    private Float grossW;
//
//    @TableField(value = "cVGroupCode")
//    private String vGroupCode;
//
//    @TableField(value = "cVUnit")
//    private String vUnit;
//
//    @TableField(value = "iDTUCounter")
//    private Integer dtuCounter;
//
//    @TableField(value = "iDTDCounter")
//    private Integer dtdCounter;
//
//    @TableField(value = "iBatchCounter")
//    private Integer batchCounter;
//
//    @TableField(value = "cShopUnit")
//    private String shopUnit;
//
//    @TableField(value = "cPurPersonCode")
//    private String purPersonCode;
//
//    @TableField(value = "bImportMedicine")
//    private Boolean importMedicine;
//
//    @TableField(value = "bFirstBusiMedicine")
//    private Boolean firstBusiMedicine;
//
//    @TableField(value = "bForeExpland")
//    private Boolean foreExpland;
//
//    @TableField(value = "cInvPlanCode")
//    private String invPlanCode;
//
//    @TableField(value = "fConvertRate")
//    private Float convertRate;
//
//    @TableField(value = "dReplaceDate")
//    private Date replaceDate;
//
//    @TableField(value = "bInvModel")
//    private Boolean invModel;
//
//    @TableField(value = "bKCCutMantissa")
//    private Boolean kcCutMantissa;
//
//    @TableField(value = "bReceiptByDT")
//    private Boolean receiptByDt;
//
//    @TableField(value = "iExpTaxRate")
//    private Float expTaxRate;
//
//    @TableField(value = "iDrawBatch")
//    private Float drawBatch;
//
//    @TableField(value = "bCheckBSATP")
//    private Boolean checkBsatp;
//
//    @TableField(value = "cInvProjectCode")
//    private String invProjectCode;
//
//    @TableField(value = "iTestRule")
//    private Short testRule;
//
//    @TableField(value = "cRuleCode")
//    private String ruleCode;
//
//    @TableField(value = "bCheckFree1")
//    private Boolean checkFree1;
//
//    @TableField(value = "bCheckFree2")
//    private Boolean checkFree2;
//
//    @TableField(value = "bCheckFree3")
//    private Boolean checkFree3;
//
//    @TableField(value = "bCheckFree4")
//    private Boolean checkFree4;
//
//    @TableField(value = "bCheckFree5")
//    private Boolean checkFree5;
//
//    @TableField(value = "bCheckFree6")
//    private Boolean checkFree6;
//
//    @TableField(value = "bCheckFree7")
//    private Boolean checkFree7;
//
//    @TableField(value = "bCheckFree8")
//    private Boolean checkFree8;
//
//    @TableField(value = "bCheckFree9")
//    private Boolean checkFree9;
//
//    @TableField(value = "bCheckFree10")
//    private Boolean checkFree10;
//
//    @TableField(value = "bBomSub")
//    private Boolean bomSub;
//
//    @TableField(value = "iCheckATP")
//    private Short checkAtp;
//
//    @TableField(value = "iInvATPId")
//    private Integer invAtpId;
//
//    @TableField(value = "iPlanTfDay")
//    private Integer planTfDay;
//
//    @TableField(value = "iOverlapDay")
//    private Integer overlapDay;
//
//    @TableField(value = "bPiece")
//    private Boolean piece;
//
//    @TableField(value = "bSrvItem")
//    private Boolean srvItem;
//
//    @TableField(value = "bSrvFittings")
//    private Boolean srvFittings;
//
//    @TableField(value = "fMaxSupply")
//    private Float maxSupply;
//
//    @TableField(value = "fMinSplit")
//    private Float minSplit;
//
//    @TableField(value = "bSpecialOrder")
//    private Boolean specialOrder;
//
//    @TableField(value = "bTrackSaleBill")
//    private Boolean trackSaleBill;
//
//    @TableField(value = "cInvMnemCode")
//    private String invMnemCode;
//
//    @TableField(value = "iPlanDefault")
//    private Short planDefault;
//
//    @TableField(value = "iPFBatchQty")
//    private Float pfBatchQty;
//
//    @TableField(value = "iAllocatePrintDgt")
//    private Integer allocatePrintDgt;
//
//    @TableField(value = "bCheckBatch")
//    private Boolean checkBatch;
//
//    @TableField(value = "bMngOldpart")
//    private Boolean mngOldPart;
//
//    @TableField(value = "iOldpartMngRule")
//    private Short oldPartMngRule;

}
