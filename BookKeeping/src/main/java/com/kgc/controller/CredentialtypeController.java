package com.kgc.controller;

import com.kgc.pojo.Credentialtype;
import com.kgc.pojo.Customers;
import com.kgc.service.CredentialtypeService;
import com.kgc.service.CustomersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shkstart
 * @create 2020-10-05 19:45
 */
@Controller
public class CredentialtypeController {
    @Resource
    CustomersService customersService;

    @Resource
    CredentialtypeService credentialTypeService;

    @RequestMapping("/")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/doIndex")
    @ResponseBody
    public Map<String,Object> doIndex(){
        Map<String,Object> map = new HashMap<>();
        List<Customers> customers = customersService.cList();
        map.put("data",customers);
        return map;
    }

    @RequestMapping("/doDel")
    @ResponseBody
    public Map<String,Object> doDel(Integer id){
        Map<String,Object> map = new HashMap<>();
        int del = customersService.del(id);
        map.put("data",del);
        return map;
    }

    @RequestMapping("/toIndex2")
    public String toIndex2(){
        return "index2";
    }

    @RequestMapping("/doIndex2")
    public String doIndex2(Customers customers, Model model){
        customers.setAddtime(new Date());
        int ins = customersService.ins(customers);
        if (ins>0){
            model.addAttribute("error","添加成功");
            return "index";
        }else{
            model.addAttribute("error","添加失败");
            return "redirect:/toIndex2";
        }
    }

    @RequestMapping("/doShenFen")
    @ResponseBody
    public Map<String,Object> doShenFen(){
        Map<String,Object> map = new HashMap<>();
        List<Credentialtype> credentialtypes = credentialTypeService.cList();
        map.put("data",credentialtypes);
        return map;
    }
}
