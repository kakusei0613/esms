package com.example.esms.controller;

import com.example.esms.domain.Employee;
import com.example.esms.mapper.IDepartmentMapper;
import com.example.esms.mapper.IPositionMapper;
import com.example.esms.service.IDepartmentService;
import com.example.esms.service.IEducationService;
import com.example.esms.service.IEmployeeService;
import com.example.esms.service.IPositionService;
import com.example.esms.util.EmployeeQueryObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    IEmployeeService employeeService;
    @Autowired
    IDepartmentService departmentService;
    @Autowired
    IPositionService positionService;
    @Autowired
    IEducationService educationService;
    @RequestMapping("/list")
    public String list(Model model, @ModelAttribute("qo")EmployeeQueryObject qo) {
        System.out.println(qo);
        model.addAttribute("pageResult",employeeService.query(qo));
//        model.addAttribute("employees", employeeService.selectAll());
        model.addAttribute("departments", departmentService.selectAll());
        return "/employee/list";
    }
    @RequestMapping("/input")
    public String input(Model model, Long id) {
        model.addAttribute("departments", departmentService.selectAll());
        model.addAttribute("positions", positionService.selectAll());
        model.addAttribute("employee", employeeService.selectById(id));
        model.addAttribute("educations", educationService.selectAll());
//        这里出错是因为Mapper映射文件里的selectById返回类型忘了写resultMap
//        System.out.println(employeeService.selectById(id));
        return "/employee/input";
    }
    @RequestMapping("/saveOrUpdate")
    public String saveOrUpdate(Employee employee) {
        employeeService.saveOrUpdate(employee);
        return "redirect:/employee/list.do";
    }
    @RequestMapping("/delete")
    public String delete(Long id) {
        employeeService.deleteById(id);
        return "/employee/list";
    }
}
