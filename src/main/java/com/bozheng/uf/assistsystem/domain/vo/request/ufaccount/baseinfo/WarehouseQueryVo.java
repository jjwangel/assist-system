package com.bozheng.uf.assistsystem.domain.vo.request.ufaccount.baseinfo;

import com.bozheng.uf.assistsystem.annotation.QueryField;
import com.bozheng.uf.assistsystem.domain.vo.request.QueryOrderBy;
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
public class WarehouseQueryVo extends QueryOrderBy {

    @ApiModelProperty(value = "仓库编码")
    @QueryField(value = "cWhCode",qcEnum = QueryConditionEnum.LIKE_RIGHT)
    private String whCode;

    @ApiModelProperty(value = "仓库名称")
    @QueryField(value = "cWhName",qcEnum = QueryConditionEnum.LIKE)
    private String whName;

    @ApiModelProperty(value = "所属部门")
    @QueryField(value = "cDepCode",qcEnum = QueryConditionEnum.LIKE_RIGHT)
    private String depCode;

    @ApiModelProperty(value = "仓库地址")
    @QueryField(value = "cWhAddress",qcEnum = QueryConditionEnum.LIKE)
    private String whAddress;

    @ApiModelProperty(value = "备注")
    @QueryField(value = "cWhMemo",qcEnum = QueryConditionEnum.LIKE)
    private String whMemo;

    @ApiModelProperty(value = "条形码")
    @QueryField(value = "cBarCode",qcEnum = QueryConditionEnum.LIKE)
    private String barCode;

}
