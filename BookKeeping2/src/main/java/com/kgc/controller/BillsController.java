package com.kgc.controller;

import com.kgc.pojo.BillType;
import com.kgc.pojo.Bills;
import com.kgc.service.BillTypeService;
import com.kgc.service.BillsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-06 18:13
 */
@Controller
public class BillsController {
    @Resource
    BillTypeService billTypeService;
    @Resource
    BillsService billsService;
    @RequestMapping("/")
    public String toIndex(Model model, String typeId) {
        if (typeId == "" || typeId == null) {
            typeId = "1";
        }
        List<BillType> types = billTypeService.selectAll();
        model.addAttribute("types", types);
        List<Bills> bills = billsService.selectBy(Integer.valueOf(typeId));
        model.addAttribute("bills", bills);
        return "index";
    }
    @RequestMapping("/toAdd")
    public String toAdd() {
        return "add";
    }
    @RequestMapping("/doAdd")
    public String doAdd(Bills bills) {
        billsService.insert(bills);
        return "redirect:/";
    }
}
