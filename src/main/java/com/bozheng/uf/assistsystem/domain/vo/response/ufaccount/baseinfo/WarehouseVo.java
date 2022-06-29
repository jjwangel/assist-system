package com.bozheng.uf.assistsystem.domain.vo.response.ufaccount.baseinfo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author jianjiawen
 * @date 2021-4-17 12:07
 */
@Data
public class WarehouseVo {

    @ApiModelProperty(value = "仓库编码")
    private String whCode;

    @ApiModelProperty(value = "仓库名称")
    private String whName;

    @ApiModelProperty(value = "所属部门")
    private String depCode;

    @ApiModelProperty(value = "仓库地址")
    private String whAddress;

    @ApiModelProperty(value = "备注")
    private String whMemo;

    @ApiModelProperty(value = "条形码")
    private String barCode;

}
