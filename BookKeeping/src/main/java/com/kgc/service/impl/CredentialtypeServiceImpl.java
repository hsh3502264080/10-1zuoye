package com.kgc.service.impl;

import com.kgc.mapper.CredentialtypeMapper;
import com.kgc.pojo.Credentialtype;
import com.kgc.pojo.CredentialtypeExample;
import com.kgc.service.CredentialtypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-05 19:49
 */
@Service("credentialtypeService")
public class CredentialtypeServiceImpl implements CredentialtypeService {
    @Resource
    CredentialtypeMapper credentialtypeMapper;

    @Override
    public List<Credentialtype> cList() {
        CredentialtypeExample example = new CredentialtypeExample();
        CredentialtypeExample.Criteria criteria = example.createCriteria();
        List<Credentialtype> credentialtypes = credentialtypeMapper.selectByExample(example);
        return credentialtypes;
    }

    @Override
    public List<Credentialtype> cList(Integer id) {
        CredentialtypeExample example = new CredentialtypeExample();
        CredentialtypeExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<Credentialtype> credentialtypes = credentialtypeMapper.selectByExample(example);
        return credentialtypes;
    }
}
