package com.bozheng.uf.assistsystem.domain.vo.response.ufsystem;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jianjiawen
 * @date 2021-2-16 17:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UfAccountVo {

    @ApiModelProperty(value = "账套号")
    private String accId;

    @ApiModelProperty(value = "账套名称")
    private String accName;

    @ApiModelProperty(value = "当前账套年度")
    private Short year;

}
