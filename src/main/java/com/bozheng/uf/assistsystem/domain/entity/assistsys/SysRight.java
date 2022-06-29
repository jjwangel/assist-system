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
 * 权限表
 * @author jianjiawen
 * @date 2021-3-11 21:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_right")
public class SysRight {
    /** id */
    @TableId(value = "id" ,type = IdType.AUTO)
    private Long id;

    /** 权限ID */
    @TableField(value = "right_id")
    private Long rightId;

    /** 权限类型 */
    @TableField(value = "right_type")
    private String rightType;

    /** 创建时间 */
    @TableField(value = "create_time")
    private Date createTime;

    /** 更新时间 */
    @TableField(value = "update_time")
    private Date updateTime;
}
