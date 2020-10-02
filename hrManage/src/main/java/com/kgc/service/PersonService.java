package com.kgc.service;

import com.kgc.pojo.Person;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-02 15:34
 */
public interface PersonService {
    List<Person> sel();
    int ins(Person person);
    int del(Integer id);
}
