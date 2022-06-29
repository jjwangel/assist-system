package com.bozheng.uf.assistsystem.domain.vo.request.ufaccount.baseinfo;

import com.bozheng.uf.assistsystem.annotation.QueryField;
import com.bozheng.uf.assistsystem.domain.vo.request.QueryOrderBy;
import com.bozheng.uf.assistsystem.enums.QueryConditionEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author jianjiawen
 * @date 2021-4-15 12:07
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DistrictClassQueryVo extends QueryOrderBy {

    @ApiModelProperty(value = "地区分类编码")
    @QueryField(value = "cDCCode",qcEnum = QueryConditionEnum.LIKE_RIGHT)
    private String dcCode;

    @ApiModelProperty(value = "地区分类名称")
    @QueryField(value = "cDCName",qcEnum = QueryConditionEnum.LIKE)
    private String dcName;

    @ApiModelProperty(value = "编码级次")
    @QueryField(value = "iDCGrade",qcEnum = QueryConditionEnum.EQ)
    private Byte dcGrade;

    @ApiModelProperty(value = "是否末级")
    @QueryField(value = "bDCEnd",qcEnum = QueryConditionEnum.EQ)
    private Boolean dcEnd;


}
