package com.kgc.service;

import com.kgc.pojo.Goods;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-07 18:25
 */
public interface GoodsService {
    List<Goods> selectByExample(Integer goodsDistrict);
    int upd(Goods goods);
}
