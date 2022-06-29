package com.bozheng.uf.assistsystem.domain.vo.response.ufaccount.ufuserinfo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author jianjiawen
 * @date 2021-4-2 12:07
 */
@Data
public class DepartmentClassVo {

    @ApiModelProperty(value = "部门编码")
    private String depCode;

    @ApiModelProperty(value = "部门名称")
    private String depName;

    @ApiModelProperty(value = "编码级次")
    private Byte depGrade;

    @ApiModelProperty(value = "是否末级")
    private Boolean depEnd;

}
