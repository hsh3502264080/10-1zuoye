package com.kgc.service.impl;

import com.kgc.mapper.AssetsMapper;
import com.kgc.pojo.Assets;
import com.kgc.pojo.AssetsExample;
import com.kgc.service.AssetsService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-04 14:59
 */
@Service("assetsService")
public class AssetsServiceImpl implements AssetsService {
    @Resource
    AssetsMapper assetsMapper;

    @Override
    public int ins(Assets assets) {
        return assetsMapper.insert(assets);
    }

    @Override
    public List<Assets> sel(String assetid,String assettype) {
        AssetsExample example=new AssetsExample();
        AssetsExample.Criteria criteria = example.createCriteria();
        if(assetid !=""){
            criteria.andAssetidEqualTo(assetid);
        }
        if(!assettype.equals("0")){
            criteria.andAssettypeEqualTo(assettype);
        }
        List<Assets> assets = assetsMapper.selectByExample(example);
        return assets;
    }
}
