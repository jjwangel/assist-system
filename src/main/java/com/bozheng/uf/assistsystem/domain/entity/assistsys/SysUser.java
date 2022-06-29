package com.bozheng.uf.assistsystem.domain.entity.assistsys;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户表
 * @author jianjiawen
 * @date 2021-2-21 17:05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "sys_user")
public class SysUser {
    /** 自增ID */
    @TableId(value = "id" ,type = IdType.AUTO)
    private Long id;

    /** 登录ID */
    @TableField(value = "login_id")
    private String loginId;

    /** 用户姓名 */
    @TableField(value = "user_name")
    private String userName;

    /** 性别：0：男、1：女 */
    @TableField(value = "sex")
    private Byte sex;

    /** 登录密码 */
    @TableField(value = "login_password")
    private String loginPassword;

    /** 所属部门 */
    @TableField(value = "department")
    private String department;

    /** 手机号 */
    @TableField(value = "mobile_num")
    private String mobileNum;

    /** 电子邮箱 */
    @TableField(value = "email")
    private String email;

    /** 描述 */
    @TableField(value = "description")
    private String description;

    /** 创建时间 */
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private Date createTime;

    /** 更新时间 */
    @TableField(value = "update_time",fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /** 最近登录时间 */
    @TableField(value = "latest_login_time")
    private Date latestLoginTime;

    /** 登录次数 */
    @TableField(value = "login_count")
    private Integer loginCount;

    /** 是否删除 */
    @TableLogic
    @TableField(value = "is_delete")
    private Byte isDelete;
}
