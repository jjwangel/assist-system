package com.bozheng.uf.assistsystem.service.ufaccount.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bozheng.uf.assistsystem.domain.entity.ufaccount.CustomerClass;
import com.bozheng.uf.assistsystem.domain.entity.ufaccount.InventoryClass;
import com.bozheng.uf.assistsystem.mapper.ufaccount.CustomerClassMapper;
import com.bozheng.uf.assistsystem.mapper.ufaccount.InventoryClassMapper;
import com.bozheng.uf.assistsystem.service.ufaccount.CustomerClassService;
import com.bozheng.uf.assistsystem.service.ufaccount.InventoryClassService;
import org.springframework.stereotype.Service;

/**
 * 
 * @author jianjiawen
 * @date 2021-4-3 17:02
 */
@Service
public class CustomerClassServiceImpl extends ServiceImpl<CustomerClassMapper, CustomerClass> implements CustomerClassService {

}
