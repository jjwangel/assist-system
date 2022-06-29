package com.bozheng.uf.assistsystem.mapper.assistsys;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.bozheng.uf.assistsystem.domain.entity.assistsys.SysUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author jianjiawen
 * @date 2021-2-21 17:09
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    /**
     * 查找所有系统用户（包括逻辑删除的用户）
     * @author jianjiawen
     * @date 2021-4-10 18:23
     * @return java.util.List<com.bozheng.uf.assistsystem.domain.entity.assistsys.SysUser>
     */
    @Select("SELECT\n" +
            "sys_user.id, \n" +
            "sys_user.login_id, \n" +
            "sys_user.user_name, \n" +
            "sys_user.sex, \n" +
            "sys_user.login_password, \n" +
            "sys_user.department, \n" +
            "sys_user.mobile_num, \n" +
            "sys_user.email, \n" +
            "sys_user.description, \n" +
            "sys_user.create_time, \n" +
            "sys_user.update_time, \n" +
            "sys_user.latest_login_time, \n" +
            "sys_user.login_count, \n" +
            "sys_user.is_delete\n" +
            "FROM\n" +
            "sys_user")
    List<SysUser> selectAllSysUser();

    /**
     * 恢复系统用户
     * @author jianjiawen
     * @date 2021-4-11 14:49
     * @param updateTime updateTime
     * @param queryWrapper queryWrapper
     */
    @Update("UPDATE sys_user set is_delete=0,update_time='${updateTime}' ${ew.customSqlSegment}")
    void restoreSysUser(LocalDateTime updateTime, @Param(Constants.WRAPPER) Wrapper<SysUser> queryWrapper);
}
