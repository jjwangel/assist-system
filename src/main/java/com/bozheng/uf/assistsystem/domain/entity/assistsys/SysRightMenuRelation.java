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
 * 权限与菜单关联表
 * @author jianjiawen
 * @date 2021-3-11 21:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_right_menu_relation")
public class SysRightMenuRelation {
    /** id */
    @TableId(value = "id" ,type = IdType.AUTO)
    private Long id;

    /** 权限ID */
    @TableField(value = "right_id")
    private Long rightId;

    /** 菜单ID */
    @TableField(value = "menu_id")
    private Long menuId;

    /** 创建时间 */
    @TableField(value = "create_time")
    private Date createTime;

    /** 更新时间 */
    @TableField(value = "update_time")
    private Date updateTime;
}
