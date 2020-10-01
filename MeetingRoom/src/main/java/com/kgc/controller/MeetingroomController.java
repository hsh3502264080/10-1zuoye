package com.kgc.controller;
import com.kgc.pojo.Meetingroom;
import com.kgc.service.MeetingroomService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shkstart
 * @create 2020-10-01 22:48
 */
@Controller
public class MeetingroomController {
    @Resource
    MeetingroomService meetingroomService;
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/sel")
    @ResponseBody
    public Map<String,Object> sel(){
        Map<String,Object> map=new HashMap<>();
        List<Meetingroom> sel = meetingroomService.sel();
        if(sel.size()>0){
            map.put("s",sel);
        }
        return map;
    }
    @RequestMapping("/ins")
    public String ins(Meetingroom meetingroom){
        int ins = meetingroomService.ins(meetingroom);
        System.out.println(ins);
        return "index";
    }


}
