package com.bozheng.uf.assistsystem.domain.vo.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author jianjiawen
 * @date 2021-3-6 12:04
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryPage extends QueryOrderBy{

    @ApiModelProperty(value = "页码", position = 91, required = true)
    private long page = 1L;

    @ApiModelProperty(value = "每页大小", position = 92, required = true)
    private long size = 10L;
}
