package com.bozheng.uf.assistsystem.domain.vo.response.ufaccount.customer;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author jianjiawen
 * @date 2021-4-2 12:07
 */
@Data
public class CustomerClassVo {

    @ApiModelProperty(value = "客户大类编码")
    private String ccCode;

    @ApiModelProperty(value = "客户大类名称")
    private String ccName;

    @ApiModelProperty(value = "编码级次")
    private Byte ccGrade;

    @ApiModelProperty(value = "是否末级")
    private Boolean ccEnd;

}
