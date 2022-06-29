package com.bozheng.uf.assistsystem.domain.vo.response.assistsys;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户表
 * @author jianjiawen
 * @date 2021-4-8 17:05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysUserVo {
    /** 记录ID */
    @ApiModelProperty(value = "用户ID")
    private Long id;

    /** 登录ID */
    @ApiModelProperty(value = "登录ID")
    private String loginId;

    /** 用户姓名 */
    @ApiModelProperty(value = "用户姓名")
    private String userName;

    /** 性别：0：男、1：女 */
    @ApiModelProperty(value = "性别：0：男、1：女")
    private Byte sex;

    /** 所属部门 */
    @ApiModelProperty(value = "所属部门")
    private String department;

    /** 手机号 */
    @ApiModelProperty(value = "手机号")
    private String mobileNum;

    /** 电子邮箱 */
    @ApiModelProperty(value = "电子邮箱")
    private String email;

    /** 描述 */
    @ApiModelProperty(value = "描述")
    private String description;

    /** 创建时间 */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /** 更新时间 */
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    /** 最近登录时间 */
    @ApiModelProperty(value = "最近登录时间")
    private Date latestLoginTime;

    /** 登录次数 */
    @ApiModelProperty(value = "登录次数")
    private Integer loginCount;

    /** 是否删除 */
    @ApiModelProperty(value = "是否删除")
    private Byte isDelete;
}
