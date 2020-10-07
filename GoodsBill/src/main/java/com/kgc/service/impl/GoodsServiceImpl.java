package com.kgc.service.impl;

import com.kgc.mapper.GoodsMapper;
import com.kgc.pojo.Goods;
import com.kgc.pojo.GoodsExample;
import com.kgc.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-07 18:26
 */
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Resource
    GoodsMapper goodsMapper;

    @Override
    public List<Goods> selectByExample(Integer goodsDistrict) {
        if(goodsDistrict==0){
            return goodsMapper.selectByExample(null);
        }
        GoodsExample goodsExample1=new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample1.createCriteria();
        criteria.andGoodsdistrictEqualTo(goodsDistrict);
        return goodsMapper.selectByExample(goodsExample1);
    }

    @Override
    public int upd(Goods goods) {
        return goodsMapper.updateByPrimaryKeySelective(goods);
    }
}
