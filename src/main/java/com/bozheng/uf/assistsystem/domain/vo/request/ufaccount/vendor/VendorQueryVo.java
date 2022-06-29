package com.bozheng.uf.assistsystem.domain.vo.request.ufaccount.vendor;

import com.bozheng.uf.assistsystem.annotation.QueryField;
import com.bozheng.uf.assistsystem.domain.vo.request.QueryPage;
import com.bozheng.uf.assistsystem.enums.QueryConditionEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @author jianjiawen
 * @date 2021-4-14 12:07
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class VendorQueryVo extends QueryPage {

    @ApiModelProperty(value = "供应商编码")
    @QueryField(value = "cVenCode",qcEnum = QueryConditionEnum.LIKE)
    private String venCode;

    @ApiModelProperty(value = "供应商名称")
    @QueryField(value = "cVenName",qcEnum = QueryConditionEnum.LIKE)
    private String venName;

    @ApiModelProperty(value = "供应商简称")
    @QueryField(value = "cVenAbbName",qcEnum = QueryConditionEnum.LIKE)
    private String venAbbName;

    @ApiModelProperty(value = "供应商分类编码")
    @QueryField(value = "cVCCode",qcEnum = QueryConditionEnum.LIKE_RIGHT)
    private String vcCode;

    @ApiModelProperty(value = "地区编码")
    @QueryField(value = "cDCCode",qcEnum = QueryConditionEnum.LIKE_RIGHT)
    private String dcCode;

    @ApiModelProperty(value = "地址")
    @QueryField(value = "cVenAddress",qcEnum = QueryConditionEnum.LIKE)
    private String venAddress;

    @ApiModelProperty(value = "venDefine1")
    @QueryField(value = "cVenDefine1",qcEnum = QueryConditionEnum.LIKE)
    private String venDefine1;

    @ApiModelProperty(value = "venDefine2")
    @QueryField(value = "cVenDefine2",qcEnum = QueryConditionEnum.LIKE)
    private String venDefine2;

    @ApiModelProperty(value = "venDefine3")
    @QueryField(value = "cVenDefine3",qcEnum = QueryConditionEnum.LIKE)
    private String venDefine3;

    @ApiModelProperty(value = "venDefine4")
    @QueryField(value = "cVenDefine4",qcEnum = QueryConditionEnum.LIKE)
    private String venDefine4;

    @ApiModelProperty(value = "venDefine5")
    @QueryField(value = "cVenDefine5",qcEnum = QueryConditionEnum.LIKE)
    private String venDefine5;

    @ApiModelProperty(value = "venDefine6")
    @QueryField(value = "cVenDefine6",qcEnum = QueryConditionEnum.LIKE)
    private String venDefine6;

    @ApiModelProperty(value = "venDefine7")
    @QueryField(value = "cVenDefine7",qcEnum = QueryConditionEnum.LIKE)
    private String venDefine7;

    @ApiModelProperty(value = "venDefine8")
    @QueryField(value = "cVenDefine8",qcEnum = QueryConditionEnum.LIKE)
    private String venDefine8;

    @ApiModelProperty(value = "venDefine9")
    @QueryField(value = "cVenDefine9",qcEnum = QueryConditionEnum.LIKE)
    private String venDefine9;

    @ApiModelProperty(value = "venDefine10")
    @QueryField(value = "cVenDefine10",qcEnum = QueryConditionEnum.LIKE)
    private String venDefine10;

    @ApiModelProperty(value = "venDefine11")
    @QueryField(value = "cVenDefine11",qcEnum = QueryConditionEnum.LIKE)
    private Integer venDefine11;

    @ApiModelProperty(value = "venDefine12")
    @QueryField(value = "cVenDefine12",qcEnum = QueryConditionEnum.LIKE)
    private Integer venDefine12;

    @ApiModelProperty(value = "venDefine13")
    @QueryField(value = "cVenDefine13",qcEnum = QueryConditionEnum.LIKE)
    private Float venDefine13;

    @ApiModelProperty(value = "venDefine14")
    @QueryField(value = "cVenDefine14",qcEnum = QueryConditionEnum.LIKE)
    private Float venDefine14;

    @ApiModelProperty(value = "venDefine15")
    @QueryField(value = "cVenDefine15",qcEnum = QueryConditionEnum.LIKE)
    private Date venDefine15;

    @ApiModelProperty(value = "venDefine16")
    @QueryField(value = "cVenDefine16",qcEnum = QueryConditionEnum.LIKE)
    private Date venDefine16;

}
