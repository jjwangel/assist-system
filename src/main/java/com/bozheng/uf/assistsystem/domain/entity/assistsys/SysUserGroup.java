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
 * 用户组表
 * @author jianjiawen
 * @date 2021-3-11 21:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_user_group")
public class SysUserGroup {
    /** id */
    @TableId(value = "id" ,type = IdType.AUTO)
    private Long id;

    /** 分组名称 */
    @TableField(value = "group_name")
    private String groupName;

    /** 描述 */
    @TableField(value = "description")
    private String description;

    /** 创建时间 */
    @TableField(value = "create_time")
    private Date createTime;

    /** 更新时间 */
    @TableField(value = "update_time")
    private Date updateTime;
}
