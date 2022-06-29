package com.bozheng.uf.assistsystem.domain.vo.request.ufaccount.ufuserinfo;

import com.bozheng.uf.assistsystem.annotation.QueryField;
import com.bozheng.uf.assistsystem.domain.vo.request.QueryPage;
import com.bozheng.uf.assistsystem.enums.QueryConditionEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author jianjiawen
 * @date 2021-4-17 12:07
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PersonQueryVo extends QueryPage {

    @ApiModelProperty(value = "职员编码")
    @QueryField(value = "cPersonCode",qcEnum = QueryConditionEnum.LIKE)
    private String personCode;

    @ApiModelProperty(value = "职员姓名")
    @QueryField(value = "cPersonName",qcEnum = QueryConditionEnum.LIKE)
    private String personName;

    @ApiModelProperty(value = "部门编码")
    @QueryField(value = "cDepCode",qcEnum = QueryConditionEnum.EQ)
    private String depCode;

    @ApiModelProperty(value = "职员属性")
    @QueryField(value = "cPersonProp",qcEnum = QueryConditionEnum.LIKE)
    private String personProp;

    @ApiModelProperty(value = "Email")
    @QueryField(value = "cPersonEmail",qcEnum = QueryConditionEnum.EQ)
    private String personEmail;

    @ApiModelProperty(value = "电话")
    @QueryField(value = "cPersonPhone",qcEnum = QueryConditionEnum.LIKE)
    private String personPhone;

    @ApiModelProperty(value = "生效日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @QueryField(value = "dPValidDate",qcEnum = QueryConditionEnum.GE)
    private Date validDate;

    @ApiModelProperty(value = "失效日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @QueryField(value = "dPInValidDate",qcEnum = QueryConditionEnum.LE)
    private Date inValidDate;

}
