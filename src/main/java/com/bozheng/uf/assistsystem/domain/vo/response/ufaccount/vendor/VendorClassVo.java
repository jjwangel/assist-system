package com.bozheng.uf.assistsystem.domain.vo.response.ufaccount.vendor;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author jianjiawen
 * @date 2021-4-2 12:07
 */
@Data
public class VendorClassVo {

    @ApiModelProperty(value = "供应商大类编码")
    private String vcCode;

    @ApiModelProperty(value = "供应商大类名称")
    private String vcName;

    @ApiModelProperty(value = "编码级次")
    private Byte vcGrade;

    @ApiModelProperty(value = "是否末级")
    private Boolean vcEnd;

}
