package com.bozheng.uf.assistsystem.domain.vo.response.ufaccount.baseinfo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author jianjiawen
 * @date 2021-4-15 12:07
 */
@Data
public class DistrictClassVo {

    @ApiModelProperty(value = "地区分类编码")
    private String dcCode;

    @ApiModelProperty(value = "地区分类名称")
    private String dcName;

    @ApiModelProperty(value = "编码级次")
    private Byte dcGrade;

    @ApiModelProperty(value = "是否末级")
    private Boolean dcEnd;

}
