package com.bozheng.uf.assistsystem.service.ufaccount.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bozheng.uf.assistsystem.domain.entity.ufaccount.Person;
import com.bozheng.uf.assistsystem.mapper.ufaccount.PersonMapper;
import com.bozheng.uf.assistsystem.service.ufaccount.PersonService;
import org.springframework.stereotype.Service;

/**
 * 
 * @author jianjiawen
 * @date 2021-4-18 17:02
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements PersonService {

}
