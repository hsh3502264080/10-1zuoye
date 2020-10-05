package com.kgc.service;

import com.kgc.pojo.Customers;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-05 19:48
 */
public interface CustomersService {
    List<Customers> cList();
    int ins(Customers customers);
    int del(Integer id);
}
