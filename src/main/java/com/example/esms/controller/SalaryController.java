package com.example.esms.controller;

import com.example.esms.query.SalaryQueryObject;
import com.example.esms.service.IDepartmentService;
import com.example.esms.service.ISalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/salary")
public class SalaryController {
    @Autowired
    ISalaryService salaryService;
    @Autowired
    IDepartmentService departmentService;
    @RequestMapping("/list")
    public String list(Model model, @ModelAttribute("sqo") SalaryQueryObject sqo) {
        model.addAttribute("pageResult", salaryService.queryForList(sqo));
        model.addAttribute("departments", departmentService.selectAll());
        return "/salary/list";
    }
}
