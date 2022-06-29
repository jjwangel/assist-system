package com.bozheng.uf.assistsystem.domain.vo.response.ufaccount.inventory;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author jianjiawen
 * @date 2021-4-2 12:07
 */
@Data
public class InventoryClassVo {

    @ApiModelProperty(value = "存货大类编码")
    private String invcCode;

    @ApiModelProperty(value = "存货大类名称")
    private String invcName;

    @ApiModelProperty(value = "编码级次")
    private Byte invcGrade;

    @ApiModelProperty(value = "是否末级")
    private Boolean invcEnd;

    @ApiModelProperty(value = "所属经济分类编码")
    private String ecoCode;

    @ApiModelProperty(value = "对应条形码编码")
    private String barCode;

}
