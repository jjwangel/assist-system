package com.bozheng.uf.assistsystem.domain.vo.response.ufaccount.inventory;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 同步用友用户VO
 * @author jianjiawen
 * @date 2021-2-25 20:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryVo {

    @ApiModelProperty(value = "存货编码")
    private String invCode;

    @ApiModelProperty(value = "存货代码")
    private String invAddCode;

    @ApiModelProperty(value = "存货名称")
    private String invName;

    @ApiModelProperty(value = "规格型号")
    private String invStd;

    @ApiModelProperty(value = "存货大类编码")
    private String invcCode;

    @ApiModelProperty(value = "存货大类名称")
    private String invcName;

    @ApiModelProperty(value = "供应商编码")
    private String venCode;

    @ApiModelProperty(value = "供应商名称")
    private String venName;

    @ApiModelProperty(value = "税率")
    private Float taxRate;

    @ApiModelProperty(value = "主计量单位编码")
    private String comUnitCode;

    @ApiModelProperty(value = "主计量单位名称")
    private String comUnitName;


}
