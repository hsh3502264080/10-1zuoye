package com.kgc.controller;

import com.kgc.pojo.Assets;
import com.kgc.service.AssetsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shkstart
 * @create 2020-10-04 14:57
 */
@Controller
public class AssetsController {

    @Resource
    AssetsService assetsService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/ins")
    public String ins(Assets assets){
        int ins = assetsService.ins(assets);
        System.out.println(ins);
        return "index";
    }
    @RequestMapping("/sel")
    @ResponseBody
    public Map<String,Object> sel(@RequestParam("assetid") String assetid,@RequestParam("assettype") String assettype){
        Map<String,Object> map=new HashMap<>();
        List<Assets> sel = assetsService.sel(assetid, assettype);
        if(sel.size()>0){
            map.put("a",sel);
        }
        return map;
    }

}
