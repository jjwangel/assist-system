package com.bozheng.uf.assistsystem.domain.vo.request.ufaccount.ufuserinfo;

import com.bozheng.uf.assistsystem.annotation.QueryField;
import com.bozheng.uf.assistsystem.domain.vo.request.QueryOrderBy;
import com.bozheng.uf.assistsystem.enums.QueryConditionEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author jianjiawen
 * @date 2021-4-2 12:07
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DepartmentClassQueryVo extends QueryOrderBy {

    @ApiModelProperty(value = "部门编码")
    @QueryField(value = "cDepCode",qcEnum = QueryConditionEnum.LIKE_RIGHT)
    private String depCode;

    @ApiModelProperty(value = "部门名称")
    @QueryField(value = "cDepName",qcEnum = QueryConditionEnum.LIKE)
    private String depName;

    @ApiModelProperty(value = "编码级次")
    @QueryField(value = "iDepGrade",qcEnum = QueryConditionEnum.EQ)
    private Byte depGrade;

    @ApiModelProperty(value = "是否末级")
    @QueryField(value = "bDepEnd",qcEnum = QueryConditionEnum.EQ)
    private Boolean depEnd;


}
