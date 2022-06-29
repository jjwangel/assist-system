package com.bozheng.uf.assistsystem.domain.vo.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jianjiawen
 * @date 2021-4-9 22:31
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryOrderBy {
    @ApiModelProperty(value = "排序", position = 90)
    private String orderBy = "";
}
