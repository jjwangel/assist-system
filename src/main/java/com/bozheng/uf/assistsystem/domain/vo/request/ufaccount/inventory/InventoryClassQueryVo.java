package com.bozheng.uf.assistsystem.domain.vo.request.ufaccount.inventory;

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
public class InventoryClassQueryVo extends QueryOrderBy {

    @ApiModelProperty(value = "存货大类编码")
    @QueryField(value = "cInvCCode",qcEnum = QueryConditionEnum.LIKE_RIGHT)
    private String invcCode;

    @ApiModelProperty(value = "存货大类名称")
    @QueryField(value = "cInvCName",qcEnum = QueryConditionEnum.LIKE)
    private String invcName;

    @ApiModelProperty(value = "编码级次")
    @QueryField(value = "iInvCGrade",qcEnum = QueryConditionEnum.EQ)
    private Byte invcGrade;

    @ApiModelProperty(value = "是否末级")
    @QueryField(value = "bInvCEnd",qcEnum = QueryConditionEnum.EQ)
    private Boolean invcEnd;

    @ApiModelProperty(value = "所属经济分类编码")
    @QueryField(value = "cEcoCode",qcEnum = QueryConditionEnum.EQ)
    private String ecoCode;

    @ApiModelProperty(value = "对应条形码编码")
    @QueryField(value = "cBarCode",qcEnum = QueryConditionEnum.EQ)
    private String barCode;

}
