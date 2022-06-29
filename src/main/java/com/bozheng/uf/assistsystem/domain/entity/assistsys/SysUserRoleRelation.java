package com.bozheng.uf.assistsystem.domain.entity.assistsys;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户与角色关联表
 * @author jianjiawen
 * @date 2021-3-11 21:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_user_role_relation")
public class SysUserRoleRelation {
    /** id */
    @TableId(value = "id" ,type = IdType.AUTO)
    private Long id;

    /** 用户ID */
    @TableField(value = "user_id")
    private Long userId;

    /** 角色ID */
    @TableField(value = "role_id")
    private Long roleId;

    /** 创建时间 */
    @TableField(value = "create_time")
    private Date createTime;

    /** 更新时间 */
    @TableField(value = "update_time")
    private Date updateTime;


}
