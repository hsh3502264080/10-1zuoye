package com.kgc.service;

import com.kgc.pojo.BillType;
import com.kgc.pojo.Bills;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-06 18:03
 */
public interface BillTypeService {
    List<BillType> selectAll();
}
