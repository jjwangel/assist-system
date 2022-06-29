package com.bozheng.uf.assistsystem.domain.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author jianjiawen
 * @date 2021-2-16 18:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVo<T> implements Serializable {

    private static final long serialVersionUID = -5233892469460172359L;

    /**
     * 返回码
     */
    @ApiModelProperty(value = "返回码", position = 0)
    private String code;
    /**
     * 返回信息
     */
    @ApiModelProperty(value = "返回信息", position = 1)
    private String message;
    /**
     * 返回数据
     */
    @ApiModelProperty(value = "返回数据", position = 2)
    private T data;
}
