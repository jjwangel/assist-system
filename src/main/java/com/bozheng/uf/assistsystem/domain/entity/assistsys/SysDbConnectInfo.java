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
 * @author jianjiawen
 * @date 2021-2-19 8:04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "sys_db_connect_info")
public class SysDbConnectInfo {
    /** ID */
    @TableId(value = "id" ,type = IdType.AUTO)
    private Byte id;

    /** 是否动态数据源，默认为：false */
    @TableField(value = "is_dynamic_datasource")
    private Byte isDynamicDatasource;

    /** 是否默认数据源，默认为：false */
    @TableField(value = "is_default_datasource")
    private Byte isDefaultDatasource;

    /** 数据库类型：mssql/mysql/oracle/db2 */
    @TableField(value = "db_type")
    private String dbType;

    /** 数据库驱动名称 */
    @TableField(value = "driver_class_name")
    private String driverClassName;

    /** 数据库名称 */
    @TableField(value = "db_name")
    private String dbName;

    /** IP地址 */
    @TableField(value = "ip")
    private String ip;

    /** 端口号 */
    @TableField(value = "port")
    private Integer port;

    /** url其他参数 */
    @TableField(value = "url_other_parameter")
    private String urlOtherParameter;

    /** 用户名 */
    @TableField(value = "user_name")
    private String userName;

    /** 密码 */
    @TableField(value = "password")
    private String password;

    /** 客户端将等待来自池的连接的最大毫秒数 */
    @TableField(value = "connection_timeout")
    private Integer connectionTimeout;

    /** 允许连接在池中闲置的最长时间 */
    @TableField(value = "idle_timeout")
    private Integer idleTimeout;

    /** 控制池中连接的最大生存期 */
    @TableField(value = "max_lifetime")
    private Integer maxLifetime;

    /** 尝试在池中维护的最小空闲连接数 */
    @TableField(value = "minimum_idle")
    private Integer minimumIdle;

    /** 控制池允许达到的最大大小 */
    @TableField(value = "maximum_poolsize")
    private Integer maximumPoolSize;

    /** 控制默认情况下从池中获取的连接是否处于只读模式，默认为：false */
    @TableField(value = "is_read_only")
    private Byte isReadOnly;

    /** 创建时间 */
    @TableField(value = "create_time")
    private Date createTime;

    /** 更新时间 */
    @TableField(value = "update_time")
    private Date updateTime;
}
