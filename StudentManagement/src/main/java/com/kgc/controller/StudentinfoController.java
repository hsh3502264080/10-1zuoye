package com.kgc.controller;

import com.kgc.pojo.Studentinfo;
import com.kgc.service.StudentinfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shkstart
 * @create 2020-10-02 14:16
 */
@Controller
public class StudentinfoController {
 @Resource
    StudentinfoService studentinfoService;


    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/sel")
    @ResponseBody
    public Map<String,Object> sel(){
        Map<String,Object> map=new HashMap<>();
        List<Studentinfo> sel = studentinfoService.sel();
        if(sel.size()>0){
            map.put("a",sel);
        }
        return map;
    }
    @RequestMapping("/chuan/{sid}/{sname}/{sgender}/{sage}/{saddress}/{semail}")
    public String chuan(@PathVariable Integer sid, @PathVariable String sname, @PathVariable String sgender, @PathVariable Integer sage, @PathVariable String saddress, @PathVariable String semail, HttpSession session){
        session.setAttribute("sid",sid);
        session.setAttribute("sname",sname);
        session.setAttribute("sgender",sgender); session.setAttribute("sage",sage); session.setAttribute("saddress",saddress); session.setAttribute("semail",semail);
        return "update";
    }
    @RequestMapping("/xiu")
    public String xio(Studentinfo studentinfo,Model model){
        int upd = studentinfoService.upd(studentinfo);
        System.out.println(upd);
        if(upd>0){
    model.addAttribute("msg","修改成功");
        }else {
            model.addAttribute("msg","修改失败");
        }
        return "index";
    }
}
