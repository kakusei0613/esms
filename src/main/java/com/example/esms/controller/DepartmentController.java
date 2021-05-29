package com.example.esms.controller;

import com.example.esms.domain.Department;
import com.example.esms.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    IDepartmentService departmentService;

    @RequestMapping("/list")
    public String selectAll(Model model) {
        model.addAttribute("departments", departmentService.selectAll());
        return "/department/list";
    }

    @RequestMapping("/add")
    public String addDepartment(Model model, Department record) {
        departmentService.insert(record);
        return "redirect:/department/list";
    }

    @RequestMapping("/delete")
    public String deleteDepartment(Model model, Integer id) {
        departmentService.deleteById(id);
        return "redirect:/department/list.do";
    }

}
