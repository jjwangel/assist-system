package com.bozheng.uf.assistsystem.service.ufaccount.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bozheng.uf.assistsystem.domain.entity.ufaccount.Customer;
import com.bozheng.uf.assistsystem.domain.entity.ufaccount.CustomerClass;
import com.bozheng.uf.assistsystem.mapper.ufaccount.CustomerClassMapper;
import com.bozheng.uf.assistsystem.mapper.ufaccount.CustomerMapper;
import com.bozheng.uf.assistsystem.service.ufaccount.CustomerClassService;
import com.bozheng.uf.assistsystem.service.ufaccount.CustomerService;
import org.springframework.stereotype.Service;

/**
 * 
 * @author jianjiawen
 * @date 2021-4-3 17:02
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

}
