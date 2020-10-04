package com.kgc.controller;

import com.github.pagehelper.PageInfo;
import com.kgc.pojo.Projectinfo;
import com.kgc.service.ProjectinfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author shkstart
 * @create 2020-10-04 17:14
 */
@Controller
public class ProjectinfoController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @Resource
    ProjectinfoService projectinfoService;
    @RequestMapping("/sel")
    @ResponseBody
    public Map<String,Object> sel(Integer pageindex,Integer  pagesize,Integer status){
        Map<String,Object> map=new HashMap<>();
        PageInfo<Projectinfo> select = projectinfoService.select(pageindex, pagesize, status);
        map.put("select",select);
        return map;
    }
    @RequestMapping("/chuan/{id}/{projectname}/{startdate}/{enddate}/{status}")
    public String chuan(@PathVariable Integer id, @PathVariable String projectname, @PathVariable String startdate,@PathVariable String enddate, @PathVariable Integer status, HttpSession session){
        session.setAttribute("id",id);
        session.setAttribute("projectname",projectname);
        session.setAttribute("startdate",startdate);
        session.setAttribute("status",status);
        session.setAttribute("enddate",enddate);
        return "index2";
    }
    @RequestMapping("/xiu")
    public String xiu(Projectinfo projectinfo, Model model){
        int upd = projectinfoService.upd(projectinfo);
        System.out.println(upd);
        if(upd>0){
            model.addAttribute("msg","修改成功");
        }else {
            model.addAttribute("msg","修改失败");
        }
        return "index";
    }
}
