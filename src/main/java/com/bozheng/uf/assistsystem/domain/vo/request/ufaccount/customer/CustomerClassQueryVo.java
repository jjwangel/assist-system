package com.bozheng.uf.assistsystem.domain.vo.request.ufaccount.customer;

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
public class CustomerClassQueryVo extends QueryOrderBy {

    @ApiModelProperty(value = "客户大类编码")
    @QueryField(value = "cCCCode",qcEnum = QueryConditionEnum.LIKE_RIGHT)
    private String ccCode;

    @ApiModelProperty(value = "客户大类名称")
    @QueryField(value = "cCCName",qcEnum = QueryConditionEnum.LIKE)
    private String ccName;

    @ApiModelProperty(value = "编码级次")
    @QueryField(value = "iCCGrade",qcEnum = QueryConditionEnum.EQ)
    private Byte ccGrade;

    @ApiModelProperty(value = "是否末级")
    @QueryField(value = "bCCEnd",qcEnum = QueryConditionEnum.EQ)
    private Boolean ccEnd;


}
