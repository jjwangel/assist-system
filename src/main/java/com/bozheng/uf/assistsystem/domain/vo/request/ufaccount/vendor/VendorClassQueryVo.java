package com.bozheng.uf.assistsystem.domain.vo.request.ufaccount.vendor;

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
public class VendorClassQueryVo extends QueryOrderBy {

    @ApiModelProperty(value = "供应商大类编码")
    @QueryField(value = "cVCCode",qcEnum = QueryConditionEnum.LIKE_RIGHT)
    private String vcCode;

    @ApiModelProperty(value = "供应商大类名称")
    @QueryField(value = "cVCName",qcEnum = QueryConditionEnum.LIKE)
    private String vcName;

    @ApiModelProperty(value = "编码级次")
    @QueryField(value = "iVCGrade",qcEnum = QueryConditionEnum.EQ)
    private Byte vcGrade;

    @ApiModelProperty(value = "是否末级")
    @QueryField(value = "bVCEnd",qcEnum = QueryConditionEnum.EQ)
    private Boolean vcEnd;


}
