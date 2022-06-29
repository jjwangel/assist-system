package com.bozheng.uf.assistsystem.service.ufsystem.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bozheng.uf.assistsystem.domain.entity.ufsystem.UaUser;
import com.bozheng.uf.assistsystem.mapper.ufsystem.UaUserMapper;
import com.bozheng.uf.assistsystem.service.ufsystem.UserService;
import org.springframework.stereotype.Service;

/**
 * @author jianjiawen
 * @date 2021-2-25 19:52
 */
@Service
public class UserServiceImpl extends ServiceImpl<UaUserMapper, UaUser> implements UserService {
}
