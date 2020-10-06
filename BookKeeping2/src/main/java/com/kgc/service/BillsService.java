package com.kgc.service;

import com.kgc.pojo.Bills;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-06 18:03
 */
public interface BillsService {
    List<Bills> selectBy(int typeId);

    void insert(Bills bills);
}
