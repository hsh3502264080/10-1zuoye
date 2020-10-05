package com.kgc.service.impl;

import com.kgc.mapper.CustomersMapper;
import com.kgc.pojo.Credentialtype;
import com.kgc.pojo.Customers;
import com.kgc.pojo.CustomersExample;
import com.kgc.service.CredentialtypeService;
import com.kgc.service.CustomersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-05 19:48
 */

@Service("customersService")
public class CustomersServiceImpl implements CustomersService {

    @Resource
    CustomersMapper customersMapper;

    @Resource
    CredentialtypeService credentialtypeService;
    @Override
    public List<Customers> cList() {
        CustomersExample example=new CustomersExample();
        CustomersExample.Criteria criteria = example.createCriteria();
        List<Customers> customers = customersMapper.selectByExample(example);
        for (Customers customer : customers) {
            List<Credentialtype> credentialtypes = credentialtypeService.cList(customer.getCredentialtypeid());
            customer.setTypeName(credentialtypes.get(0).getName());
        }
        return customers;
    }

    @Override
    public int ins(Customers customers) {
        int i = customersMapper.insertSelective(customers);
        return i;
    }

    @Override
    public int del(Integer id) {
        int i = customersMapper.deleteByPrimaryKey(id);
        return i;
    }
}
