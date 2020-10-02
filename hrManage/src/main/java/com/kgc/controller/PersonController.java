package com.kgc.controller;

import com.kgc.pojo.Person;
import com.kgc.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shkstart
 * @create 2020-10-02 15:35
 */
@Controller
public class PersonController {
    @Resource
    PersonService personService;
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/sel")
    @ResponseBody
    public Map<String,Object> sel(){
        Map<String,Object> map=new HashMap<>();

        List<Person> sel = personService.sel();
        if(sel.size()>0){
            map.put("s",sel);
        }
        return map;
    }
    @RequestMapping("/ins")
    public String ins(Person person){
        int ins = personService.ins(person);
        return "index";
    }
    @RequestMapping("/del")
    @ResponseBody
    public Map<String,Object> del(Integer id){
        Map<String,Object> map=new HashMap<>();
        int del = personService.del(id);
        return map;
    }

}
