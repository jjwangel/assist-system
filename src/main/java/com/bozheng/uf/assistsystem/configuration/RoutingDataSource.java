package com.bozheng.uf.assistsystem.configuration;

import com.bozheng.uf.assistsystem.constants.DbUrlConstant;
import com.bozheng.uf.assistsystem.enums.DbTypeEnum;
import com.bozheng.uf.assistsystem.utils.DataSourceHolder;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.EnvironmentAware;

import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import javax.sql.DataSource;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jianjiawen
 * @date 2021-2-19 16:47
 * 有事务的情况下,多数据源下会失效,
 * 具体原因是复用connection(ConnectionHolder),就算你切换了代理的dataSource,connection不会被变更
 */
@Component
@Slf4j
public class RoutingDataSource extends AbstractRoutingDataSource implements EnvironmentAware {

    /**
     * 环境变理
     */
    private Environment environment;

    /**
     * 代理数据源
     */
    private Map<Object,Object> dataSourceMap;

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
        init();
    }

    /**
     * 当需要获取数据源时系统会调用该方法，
     * 跟据aop的setKey获取数据源key，如果返回是null，则用默认数据源，否则用key中对应的map中的数据源
     * @return Object
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceHolder.getKey();
    }

    /**
     * 初始化
     */
    public void init(){
        // 从配置文件中获取数据源
        DataSource configDataSource = getConfigDataSource();

        // 从配置数据源中读取要初始化的数据源的数据
        initProxyDataSourceByConfigDataSource(configDataSource);
    }

    /**
     * 从Application.yml中获取数据源（bz_uf_assist_system）
     * @return DataSource
     */
    private DataSource getConfigDataSource(){
        return DataSourceBuilder.create()
                .type(HikariDataSource.class)
                .password(environment.getProperty("spring.datasource.password"))
                .username(environment.getProperty("spring.datasource.username"))
                .url(environment.getProperty("spring.datasource.url"))
                .driverClassName(environment.getProperty("spring.datasource.driver-class-name"))
                .build();
    }

    /**
     * 从默认数据源中读取要初始化的数据源的数据
     * @param configDataSource 配置数据源
     */
    private void initProxyDataSourceByConfigDataSource(DataSource configDataSource ){
        dataSourceMap = new HashMap<>(16);
        Connection connection = null;

        try {
            String sql = "SELECT id, is_dynamic_datasource, is_default_datasource, db_type, driver_class_name," +
                    "db_name, ip, port, url_other_parameter, user_name, password, connection_timeout, idle_timeout," +
                    "max_lifetime, minimum_idle, maximum_poolsize, is_read_only, create_time, update_time " +
                    "FROM sys_db_connect_info " +
                    "ORDER BY is_default_datasource DESC,is_dynamic_datasource,id ";
            String url = "";

            connection = configDataSource.getConnection();
            PreparedStatement prepareStatement = connection.prepareStatement(sql);
            ResultSet resultSet = prepareStatement.executeQuery();

            while (resultSet.next()){
                if(resultSet.getString("db_type").toUpperCase().equals(DbTypeEnum.MSSQL.getValue())) {
                    url = MessageFormat.format(DbUrlConstant.MSSQL_URL,
                            resultSet.getString("ip").trim(),
                            String.valueOf(resultSet.getInt("port")),
                            resultSet.getString("db_name").trim(),
                            resultSet.getString("url_other_parameter").trim());
                } else { // 判断其他数据库URL
                    url = "";
                }

                DataSourceBuilder<HikariDataSource> hikariDataSourceBuilder = DataSourceBuilder.create()
                        .type(HikariDataSource.class);

                HikariDataSource hikariDataSource = hikariDataSourceBuilder
                        .password(resultSet.getString("password"))
                        .username(resultSet.getString("user_name"))
                        .url(url)
                        .driverClassName(resultSet.getString("driver_class_name"))
                        .build();

                hikariDataSource.setConnectionTimeout(resultSet.getInt("connection_timeout"));
                hikariDataSource.setIdleTimeout(resultSet.getInt("idle_timeout"));
                hikariDataSource.setMaxLifetime(resultSet.getInt("max_lifetime"));
                hikariDataSource.setMinimumIdle(resultSet.getInt("minimum_idle"));
                hikariDataSource.setMaximumPoolSize(resultSet.getInt("maximum_poolsize"));
                hikariDataSource.setReadOnly(resultSet.getBoolean("is_read_only"));

                if(resultSet.getBoolean("is_default_datasource")){
                    // 设置默认数据源
                    setDefaultTargetDataSource(hikariDataSource);
                } else {
                    this.dataSourceMap.put(resultSet.getString("db_name"),hikariDataSource);
                }
            }
            setTargetDataSources(dataSourceMap);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //释放连接
            DataSourceUtils.releaseConnection(connection,configDataSource);
        }
    }

    /**
     * 新增数据源
     * @param key key
     * @param dataSource dataSource
     */
    public void addProxyDataSource(String key,DataSource dataSource){
        DataSource existsDataSource = (DataSource) dataSourceMap.get(key);
        // 销毁已存在的dataSource
        if(existsDataSource != null){
            Method closeMethod = ReflectionUtils.findMethod(existsDataSource.getClass(), "close");
            if(closeMethod != null){
                ReflectionUtils.invokeMethod(closeMethod,existsDataSource);
            }
        }
        dataSourceMap.put(key,dataSource);
        this.afterPropertiesSet();
    }
}
