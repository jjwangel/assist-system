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
 * 菜单表
 * @author jianjiawen
 * @date 2021-3-11 21:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_menu")
public class SysMenu {
    /** id */
    @TableId(value = "id" ,type = IdType.AUTO)
    private Long id;

    /** 菜单代码 */
    @TableField(value = "menu_code")
    private String menuCode;

    /** 菜单名称 */
    @TableField(value = "menu_name")
    private String menuName;

    /** 层级 */
    @TableField(value = "grade")
    private Integer grade;

    /** 是否最后一层 */
    @TableField(value = "is_end")
    private Byte isEnd;

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
