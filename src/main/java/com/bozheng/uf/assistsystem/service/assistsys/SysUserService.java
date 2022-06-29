package com.bozheng.uf.assistsystem.service.assistsys;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bozheng.uf.assistsystem.domain.entity.assistsys.SysUser;
import com.bozheng.uf.assistsystem.domain.entity.ufsystem.UaUser;
import com.bozheng.uf.assistsystem.domain.vo.response.assistsys.SyncSysUserVo;

import java.util.List;

/**
 * @author jianjiawen
 * @date 2021-2-21 17:10
 */
public interface SysUserService extends IService<SysUser> {

    /**
     * 登录系统
     * @param userId 用户ID
     * @param loginPassword 登录密码
     * @return SysUser
     */
    SysUser login(String userId, String loginPassword);

    /**
     * 查找所有系统用户（包括逻辑删除的用户）
     * @author jianjiawen
     * @date 2021-4-10 18:16
     * @return java.util.List<com.bozheng.uf.assistsystem.domain.entity.assistsys.SysUser>
     */
    List<SysUser> findAllSysUser();

    /**
     * 同步用户用户
     * @author jianjiawen
     * @date 2021-3-27 23:08
     * @param lstUaUser lstUaUser
     * @return SyncSysUserVo
     */
    SyncSysUserVo syncSysUserFromUf(List<UaUser> lstUaUser);

    /**
     * 查找系统用户并分页
     * @author jianjiawen
     * @date 2021-4-8 19:42
     * @param page 当前页码
     * @param size 每页大小
     * @param queryWrapper  查询条件
     * @return IPage<SysUserDto>
     */
    IPage<SysUser> findSysUserByPage(long page, long size, Wrapper<SysUser> queryWrapper);

    /**
     * 恢复删除的用户
     * @author jianjiawen
     * @date 2021-4-11 13:49
     * @param lstId lstId
     */
    void restoreSysUser(List<Long> lstId);

}
