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
 * 用户与用户组关联表
 * @author jianjiawen
 * @date 2021-3-11 21:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_user_group_relation")
public class SysUserGroupRelation {
    /** id */
    @TableId(value = "id" ,type = IdType.AUTO)
    private Long id;

    /** 用户ID */
    @TableField(value = "user_id")
    private Long userId;

    /** 用户组ID */
    @TableField(value = "group_id")
    private Long groupId;

    /** 创建时间 */
    @TableField(value = "create_time")
    private Date createTime;

    /** 更新时间 */
    @TableField(value = "update_time")
    private Date updateTime;

}
