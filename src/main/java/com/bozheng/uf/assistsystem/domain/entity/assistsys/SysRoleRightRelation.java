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
 * 角色与权限关联表
 * @author jianjiawen
 * @date 2021-3-11 21:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_role_right_relation")
public class SysRoleRightRelation {
    /** id */
    @TableId(value = "id" ,type = IdType.AUTO)
    private Long id;

    /** 角色ID */
    @TableField(value = "role_id")
    private Long roleId;

    /** 权限ID */
    @TableField(value = "right_id")
    private Long rightId;

    /** 创建时间 */
    @TableField(value = "create_time")
    private Date createTime;

    /** 更新时间 */
    @TableField(value = "update_time")
    private Date updateTime;

}
