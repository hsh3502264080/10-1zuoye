package com.kgc.service.impl;

import com.kgc.mapper.BillTypeMapper;
import com.kgc.mapper.BillsMapper;
import com.kgc.pojo.BillType;
import com.kgc.pojo.Bills;
import com.kgc.pojo.BillsExample;
import com.kgc.service.BillsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-06 18:03
 */
@Service("billsService")
public class BillsServiceImpl implements BillsService {
    @Resource
    BillsMapper billsMapper;

    @Resource
    BillTypeMapper billTypeMapper;

    @Override
    public List<Bills> selectBy(int typeId) {
        List<Bills> bills;
        BillsExample billsExample = new BillsExample();
        BillsExample.Criteria criteria = billsExample.createCriteria();
        if (typeId == 1) {
            bills = billsMapper.selectByExample(null);
        } else {
            criteria.andTypeIdEqualTo(typeId);
            bills = billsMapper.selectByExample(billsExample);
        }
        /*   criteria.andBillTimeLessThanOrEqualTo(dbillTime);*/

        for (Bills bill : bills) {
            BillType billType = billTypeMapper.selectByPrimaryKey(bill.getTypeId());
            bill.setTypeName(billType.getName());
        }

        return bills;
    }

    @Override
    public void insert(Bills bills) {
        billsMapper.insertSelective(bills);
    }
}
