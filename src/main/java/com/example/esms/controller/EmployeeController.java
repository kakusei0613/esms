package com.example.esms.controller;

import com.example.esms.mapper.IDepartmentMapper;
import com.example.esms.mapper.IPositionMapper;
import com.example.esms.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    IEmployeeService employeeService;
    @Autowired
    IDepartmentMapper departmentMapper;
    @Autowired
    IPositionMapper positionMapper;
    @RequestMapping("/list")
    public String selectAll(Model model) {
        model.addAttribute("employees", employeeService.selectAll());
        return "/employee/list";
    }
    @RequestMapping("/input")
    public String input(Model model, Long id) {
        model.addAttribute("departments", departmentMapper.selectAll());
        model.addAttribute("positions", positionMapper.selectAll());
        model.addAttribute("employee", employeeService.selectById(id));
//        这里出错是因为Mapper映射文件里的selectById返回类型忘了写resultMap
//        System.out.println(employeeService.selectById(id));
        return "/employee/input";
    }
}
