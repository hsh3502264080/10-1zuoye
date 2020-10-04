package com.kgc.service;

import com.kgc.pojo.Assets;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-04 14:59
 */
public interface AssetsService {
   int ins(Assets assets);
   List<Assets> sel(String assetid,String assettype);
}
