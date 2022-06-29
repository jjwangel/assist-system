package com.bozheng.uf.assistsystem.domain.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author jianjiawen
 * @date 2021-2-16 18:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultPageVo<T> implements Serializable {
    private static final long serialVersionUID = -3301612689320761592L;
    /**
     * 总页数
     */
    @ApiModelProperty(value = "总页数")
    private long pageCount;

    /**
     * 总记录数
     */
    @ApiModelProperty(value = "总记录数")
    private long RecordCount;
    /**
     * 当前页码
     */
    @ApiModelProperty(value = "当前页码")
    private long currentPage;

    /**
     * 每页大小
     */
    @ApiModelProperty(value = "每页大小")
    private long size;
    /**
     * 记录
     */
    @ApiModelProperty(value = "返回记录集")
    private List<T> records;
}
