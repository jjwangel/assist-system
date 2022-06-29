package com.bozheng.uf.assistsystem.domain.vo.request.ufaccount.customer;

import com.bozheng.uf.assistsystem.annotation.QueryField;
import com.bozheng.uf.assistsystem.domain.vo.request.QueryPage;
import com.bozheng.uf.assistsystem.enums.QueryConditionEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @author jianjiawen
 * @date 2021-3-6 12:07
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerQueryVo extends QueryPage {

    @ApiModelProperty(value = "客户编码")
    @QueryField(value = "cCusCode",qcEnum = QueryConditionEnum.LIKE)
    private String cusCode;

    @ApiModelProperty(value = "客户名称")
    @QueryField(value = "cCusName",qcEnum = QueryConditionEnum.LIKE)
    private String cusName;

    @ApiModelProperty(value = "客户简称")
    @QueryField(value = "cCusAbbName",qcEnum = QueryConditionEnum.LIKE)
    private String cusAbbName;

    @ApiModelProperty(value = "客户分类编码")
    @QueryField(value = "cCCCode",qcEnum = QueryConditionEnum.LIKE_RIGHT)
    private String ccCode;

    @ApiModelProperty(value = "地区编码")
    @QueryField(value = "cDCCode",qcEnum = QueryConditionEnum.LIKE_RIGHT)
    private String dcCode;

    @ApiModelProperty(value = "地址")
    @QueryField(value = "cCusAddress",qcEnum = QueryConditionEnum.LIKE)
    private String cusAddress;

    @ApiModelProperty(value = "cusDefine1")
    @QueryField(value = "cCusDefine1",qcEnum = QueryConditionEnum.LIKE)
    private String cusDefine1;

    @ApiModelProperty(value = "cusDefine2")
    @QueryField(value = "cCusDefine2",qcEnum = QueryConditionEnum.LIKE)
    private String cusDefine2;

    @ApiModelProperty(value = "cusDefine3")
    @QueryField(value = "cCusDefine3",qcEnum = QueryConditionEnum.LIKE)
    private String cusDefine3;

    @ApiModelProperty(value = "cusDefine4")
    @QueryField(value = "cCusDefine4",qcEnum = QueryConditionEnum.LIKE)
    private String cusDefine4;

    @ApiModelProperty(value = "cusDefine5")
    @QueryField(value = "cCusDefine5",qcEnum = QueryConditionEnum.LIKE)
    private String cusDefine5;

    @ApiModelProperty(value = "cusDefine6")
    @QueryField(value = "cCusDefine6",qcEnum = QueryConditionEnum.LIKE)
    private String cusDefine6;

    @ApiModelProperty(value = "cusDefine7")
    @QueryField(value = "cCusDefine7",qcEnum = QueryConditionEnum.LIKE)
    private String cusDefine7;

    @ApiModelProperty(value = "cusDefine8")
    @QueryField(value = "cCusDefine8",qcEnum = QueryConditionEnum.LIKE)
    private String cusDefine8;

    @ApiModelProperty(value = "cusDefine9")
    @QueryField(value = "cCusDefine9",qcEnum = QueryConditionEnum.LIKE)
    private String cusDefine9;

    @ApiModelProperty(value = "cusDefine10")
    @QueryField(value = "cCusDefine10",qcEnum = QueryConditionEnum.LIKE)
    private String cusDefine10;

    @ApiModelProperty(value = "cusDefine10")
    @QueryField(value = "cCusDefine11",qcEnum = QueryConditionEnum.LIKE)
    private Integer cusDefine11;

    @ApiModelProperty(value = "cusDefine12")
    @QueryField(value = "cCusDefine12",qcEnum = QueryConditionEnum.LIKE)
    private Integer cusDefine12;

    @ApiModelProperty(value = "cusDefine13")
    @QueryField(value = "cCusDefine13",qcEnum = QueryConditionEnum.LIKE)
    private Float cusDefine13;

    @ApiModelProperty(value = "cusDefine14")
    @QueryField(value = "cCusDefine14",qcEnum = QueryConditionEnum.LIKE)
    private Float cusDefine14;

    @ApiModelProperty(value = "cusDefine15")
    @QueryField(value = "cCusDefine15",qcEnum = QueryConditionEnum.LIKE)
    private Date cusDefine15;

    @ApiModelProperty(value = "cusDefine16")
    @QueryField(value = "cCusDefine16",qcEnum = QueryConditionEnum.LIKE)
    private Date cusDefine16;

}
