package com.bozheng.uf.assistsystem.domain.vo.request.assistsys;

import com.bozheng.uf.assistsystem.annotation.QueryField;
import com.bozheng.uf.assistsystem.domain.vo.request.QueryPage;
import com.bozheng.uf.assistsystem.enums.QueryConditionEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户表
 * @author jianjiawen
 * @date 2021-4-8 17:05
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysUserQueryVo extends QueryPage {

    /** 登录ID */
    @ApiModelProperty(value = "登录ID")
    @QueryField(value = "login_id",qcEnum = QueryConditionEnum.EQ)
    private String loginId;

    /** 用户姓名 */
    @ApiModelProperty(value = "用户姓名")
    @QueryField(value = "user_name",qcEnum = QueryConditionEnum.LIKE)
    private String userName;

    /** 性别：0：男、1：女 */
    @ApiModelProperty(value = "性别：0：男、1：女")
    @QueryField(value = "sex",qcEnum = QueryConditionEnum.EQ)
    private Byte sex;

    /** 所属部门 */
    @ApiModelProperty(value = "所属部门")
    @QueryField(value = "department",qcEnum = QueryConditionEnum.LIKE)
    private String department;

    /** 手机号 */
    @ApiModelProperty(value = "手机号")
    @QueryField(value = "mobile_num",qcEnum = QueryConditionEnum.LIKE)
    private String mobileNum;

    /** 电子邮箱 */
    @ApiModelProperty(value = "电子邮箱")
    @QueryField(value = "email",qcEnum = QueryConditionEnum.EQ)
    private String email;

    /** 描述 */
    @ApiModelProperty(value = "描述")
    @QueryField(value = "description",qcEnum = QueryConditionEnum.LIKE)
    private String description;

    /** 是否删除 */
    @ApiModelProperty(value = "是否删除")
    @QueryField(value = "is_delete",qcEnum = QueryConditionEnum.EQ)
    private Byte isDelete;

}
