package com.bozheng.uf.assistsystem.domain.vo.response.ufaccount.vendor;

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
@Data
public class VendorVo {

    @ApiModelProperty(value = "供应商编码")
    private String venCode;

    @ApiModelProperty(value = "供应商名称")
    private String venName;

    @ApiModelProperty(value = "供应商简称")
    private String venAbbName;

    @ApiModelProperty(value = "供应商分类编码")
    private String vcCode;

    @ApiModelProperty(value = "地区编码")
    private String dcCode;

    @ApiModelProperty(value = "地址")
    private String venAddress;

    @ApiModelProperty(value = "venDefine1")
    private String venDefine1;

    @ApiModelProperty(value = "venDefine2")
    private String venDefine2;

    @ApiModelProperty(value = "venDefine3")
    private String venDefine3;

    @ApiModelProperty(value = "venDefine4")
    private String venDefine4;

    @ApiModelProperty(value = "venDefine5")
    private String venDefine5;

    @ApiModelProperty(value = "venDefine6")
    private String venDefine6;

    @ApiModelProperty(value = "venDefine7")
    private String venDefine7;

    @ApiModelProperty(value = "venDefine8")
    private String venDefine8;

    @ApiModelProperty(value = "venDefine9")
    private String venDefine9;

    @ApiModelProperty(value = "venDefine10")
    private String venDefine10;

    @ApiModelProperty(value = "venDefine11")
    private Integer venDefine11;

    @ApiModelProperty(value = "venDefine12")
    private Integer venDefine12;

    @ApiModelProperty(value = "venDefine13")
    private Float venDefine13;

    @ApiModelProperty(value = "venDefine14")
    private Float venDefine14;

    @ApiModelProperty(value = "venDefine15")
    private Date venDefine15;

    @ApiModelProperty(value = "venDefine16")
    private Date venDefine16;

}
