package com.kgc.controller;

import com.kgc.pojo.Goods;
import com.kgc.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shkstart
 * @create 2020-10-07 18:29
 */
@Controller
public class GoodsController {
    @Resource
    GoodsService goodsService;
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/chuan")
    @ResponseBody
    public Map<String,Object> chuan(Integer goodsDistrict){
        Map<String,Object> map=new HashMap<>();
        List<Goods> goods = goodsService.selectByExample(goodsDistrict);
        System.out.println(goods);
        map.put("sel",goods);
        return map;
    }
    @RequestMapping("/chuan2/{goodsDistrict}")
    public String chuan2(@PathVariable Integer goodsDistrict, HttpSession session){
session.setAttribute("goodsDistrict",goodsDistrict);
        return "index2";
    }
    @RequestMapping("/chuan3/{id}/{name}/{price}/{count}/{billstatus}")
    public String chuan3(HttpSession session,@PathVariable Integer id,@PathVariable String name,@PathVariable Float price,@PathVariable Long count,@PathVariable Integer billstatus){
        session.setAttribute("chuan2_id",id);
        session.setAttribute("chuan_name",name);
        session.setAttribute("chuan_jiage",price);
        session.setAttribute("chuan_shuliang",count);
        session.setAttribute("status",billstatus);
        return "update";
    }
    @RequestMapping("/xiu")
    public String xiu(Goods goods){
        int upd = goodsService.upd(goods);

        return "index2";
    }
}
