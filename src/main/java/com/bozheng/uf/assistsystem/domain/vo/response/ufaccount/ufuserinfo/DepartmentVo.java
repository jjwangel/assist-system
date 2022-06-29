package com.bozheng.uf.assistsystem.domain.vo.response.ufaccount.ufuserinfo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author jianjiawen
 * @date 2021-4-17 12:07
 */
@Data
public class DepartmentVo {

    @ApiModelProperty(value = "部门编码")
    private String depCode;

    @ApiModelProperty(value = "部门名称")
    private String depName;

    @ApiModelProperty(value = "编码级次")
    private String depGrade;

    @ApiModelProperty(value = "是否末级")
    private String depEnd;

    @ApiModelProperty(value = "负责人编码")
    private String depPerson;

    @ApiModelProperty(value = "部门属性")
    private String depProp;

    @ApiModelProperty(value = "电话")
    private String depPhone;

    @ApiModelProperty(value = "地址")
    private String depAddress;

    @ApiModelProperty(value = "备注")
    private String depMemo;

    @ApiModelProperty(value = "全局ID")
    private String depGuid;

    @ApiModelProperty(value = "传真")
    private String depFax;

    @ApiModelProperty(value = "邮政编码")
    private String depPostCode;

    @ApiModelProperty(value = "部门类型")
    private String depType;

    @ApiModelProperty(value = "部门序号")
    private Integer depOrder;

    @ApiModelProperty(value = "部门全称")
    private String depFullName;

    @ApiModelProperty(value = "分管领导")
    private String depLeader;

}
