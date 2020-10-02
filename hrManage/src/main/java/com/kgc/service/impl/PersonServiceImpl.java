package com.kgc.service.impl;

import com.kgc.mapper.PersonMapper;
import com.kgc.pojo.Person;
import com.kgc.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-02 15:34
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Resource
    PersonMapper personMapper;

    @Override
    public List<Person> sel() {
return personMapper.selectByExample(null);

    }

    @Override
    public int ins(Person person) {

        return personMapper.insert(person);
    }

    @Override
    public int del(Integer id) {

        return personMapper.deleteByPrimaryKey(id);
    }
}
