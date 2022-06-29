package com.bozheng.uf.assistsystem.domain.vo.request.ufaccount.inventory;

import com.bozheng.uf.assistsystem.annotation.QueryField;
import com.bozheng.uf.assistsystem.domain.vo.request.QueryPage;
import com.bozheng.uf.assistsystem.enums.QueryConditionEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author jianjiawen
 * @date 2021-3-6 12:07
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InventoryQueryVo extends QueryPage {

    @ApiModelProperty(value = "存货编码")
    @QueryField(value = "cInvCode",qcEnum = QueryConditionEnum.LIKE)
    private String invCode;

    @ApiModelProperty(value = "存货代码")
    @QueryField(value = "cInvAddCode")
    private String invAddCode;

    @ApiModelProperty(value = "存货名称")
    @QueryField(value = "cInvName",qcEnum = QueryConditionEnum.LIKE)
    private String invName;

    @ApiModelProperty(value = "规格型号")
    @QueryField(value = "cInvStd",qcEnum = QueryConditionEnum.LIKE)
    private String invStd;

    @ApiModelProperty(value = "存货大类编码")
    @QueryField(value = "Inventory.cInvCCode",qcEnum = QueryConditionEnum.LIKE_RIGHT)
    private String invcCode;

}
