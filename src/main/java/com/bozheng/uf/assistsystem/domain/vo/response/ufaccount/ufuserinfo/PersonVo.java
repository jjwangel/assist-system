package com.bozheng.uf.assistsystem.domain.vo.response.ufaccount.ufuserinfo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.util.Date;

/**
 * @author jianjiawen
 * @date 2021-4-18 12:07
 */
@Data
public class PersonVo {

    @ApiModelProperty(value = "职员编码")
    private String personCode;

    @ApiModelProperty(value = "职员姓名")
    private String personName;

    @ApiModelProperty(value = "部门编码")
    private String depCode;

    @ApiModelProperty(value = "职员属性")
    private String personProp;

    @ApiModelProperty(value = "信用额度")
    private Float creditQuantity;

    @ApiModelProperty(value = "信用期限")
    private Integer creDate;

    @ApiModelProperty(value = "信用等级")
    private String creGrade;

    @ApiModelProperty(value = "最低折扣率")
    private Float lowRate;

    @ApiModelProperty(value = "销售贡献等级")
    private String offerGrade;

    @ApiModelProperty(value = "销售贡献率")
    private Float offerRate;

    @ApiModelProperty(value = "Email")
    private String personEmail;

    @ApiModelProperty(value = "电话")
    private String personPhone;

    @ApiModelProperty(value = "生效日期")
    private Date validDate;

    @ApiModelProperty(value = "失效日期")
    private Date inValidDate;

}
