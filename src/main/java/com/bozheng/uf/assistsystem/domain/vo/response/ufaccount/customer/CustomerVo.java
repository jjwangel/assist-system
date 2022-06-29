package com.bozheng.uf.assistsystem.domain.vo.response.ufaccount.customer;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author jianjiawen
 * @date 2021-3-6 12:07
 */
@Data
public class CustomerVo {

    @ApiModelProperty(value = "客户编码")
    private String cusCode;

    @ApiModelProperty(value = "客户名称")
    private String cusName;

    @ApiModelProperty(value = "客户简称")
    private String cusAbbName;

    @ApiModelProperty(value = "客户分类编码")
    private String ccCode;

    @ApiModelProperty(value = "地区编码")
    private String dcCode;

    @ApiModelProperty(value = "地址")
    private String cusAddress;

    @ApiModelProperty(value = "cusDefine1")
    private String cusDefine1;

    @ApiModelProperty(value = "cusDefine2")
    private String cusDefine2;

    @ApiModelProperty(value = "cusDefine3")
    private String cusDefine3;

    @ApiModelProperty(value = "cusDefine4")
    private String cusDefine4;

    @ApiModelProperty(value = "cusDefine5")
    private String cusDefine5;

    @ApiModelProperty(value = "cusDefine6")
    private String cusDefine6;

    @ApiModelProperty(value = "cusDefine7")
    private String cusDefine7;

    @ApiModelProperty(value = "cusDefine8")
    private String cusDefine8;

    @ApiModelProperty(value = "cusDefine9")
    private String cusDefine9;

    @ApiModelProperty(value = "cusDefine10")
    private String cusDefine10;

    @ApiModelProperty(value = "cusDefine11")
    private Integer cusDefine11;

    @ApiModelProperty(value = "cusDefine12")
    private Integer cusDefine12;

    @ApiModelProperty(value = "cusDefine13")
    private Float cusDefine13;

    @ApiModelProperty(value = "cusDefine14")
    private Float cusDefine14;

    @ApiModelProperty(value = "cusDefine15")
    private Date cusDefine15;

    @ApiModelProperty(value = "cusDefine16")
    private Date cusDefine16;

}
