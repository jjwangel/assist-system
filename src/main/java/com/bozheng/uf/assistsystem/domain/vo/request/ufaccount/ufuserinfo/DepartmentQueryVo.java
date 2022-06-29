package com.bozheng.uf.assistsystem.domain.vo.request.ufaccount.ufuserinfo;

import com.bozheng.uf.assistsystem.annotation.QueryField;
import com.bozheng.uf.assistsystem.domain.vo.request.QueryPage;
import com.bozheng.uf.assistsystem.enums.QueryConditionEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author jianjiawen
 * @date 2021-4-17 12:07
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DepartmentQueryVo extends QueryPage {

    @ApiModelProperty(value = "部门编码")
    @QueryField(value = "cDepCode",qcEnum = QueryConditionEnum.LIKE_RIGHT)
    private String depCode;

    @ApiModelProperty(value = "部门名称")
    @QueryField(value = "cDepName",qcEnum = QueryConditionEnum.LIKE)
    private String depName;

    @ApiModelProperty(value = "编码级次")
    @QueryField(value = "iDepGrade",qcEnum = QueryConditionEnum.EQ)
    private String depGrade;

    @ApiModelProperty(value = "是否末级")
    @QueryField(value = "bDepEnd",qcEnum = QueryConditionEnum.EQ)
    private String depEnd;

    @ApiModelProperty(value = "负责人编码")
    @QueryField(value = "cDepPerson",qcEnum = QueryConditionEnum.EQ)
    private String depPerson;

    @ApiModelProperty(value = "部门属性")
    @QueryField(value = "cDepProp",qcEnum = QueryConditionEnum.LIKE)
    private String depProp;

    @ApiModelProperty(value = "电话")
    @QueryField(value = "cDepPhone",qcEnum = QueryConditionEnum.LIKE)
    private String depPhone;

    @ApiModelProperty(value = "地址")
    @QueryField(value = "cDepAddress",qcEnum = QueryConditionEnum.LIKE)
    private String depAddress;

    @ApiModelProperty(value = "备注")
    @QueryField(value = "cDepMemo",qcEnum = QueryConditionEnum.LIKE)
    private String depMemo;

    @ApiModelProperty(value = "传真")
    @QueryField(value = "cDepFax",qcEnum = QueryConditionEnum.LIKE)
    private String depFax;

    @ApiModelProperty(value = "邮政编码")
    @QueryField(value = "cDepPostCode",qcEnum = QueryConditionEnum.LIKE)
    private String depPostCode;

    @ApiModelProperty(value = "部门类型")
    @QueryField(value = "cDepType",qcEnum = QueryConditionEnum.LIKE)
    private String depType;

    @ApiModelProperty(value = "分管领导")
    @QueryField(value = "cDepLeader",qcEnum = QueryConditionEnum.LIKE)
    private String depLeader;

}
