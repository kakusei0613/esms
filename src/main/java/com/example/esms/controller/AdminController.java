package com.example.esms.controller;

import com.example.esms.domain.Admin;
import com.example.esms.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    IAdminService adminService;
    @RequestMapping("/login")
    public String login(Model model, String username, String password) {
        if(adminService.login(username, password)) {
            return "redirect:/login.jsp";
        }
        else {
            return "redirect:/employee/list.do";
        }
    }
    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("admins", adminService.selectAll());
        return "/admin/list";
    }
    @RequestMapping("/add")
    public String insert(Model model, Admin record) {
        adminService.insert(record);
        return "redirect:/admin/list";
    }
    @RequestMapping("/delete")
    public String delete(Model model, Integer id) {
        adminService.deleteById(id);
        return "redirect:/admin/list";
    }
    @RequestMapping("/logout")
    public String logout(Model model) {
        return "redirect:/admin/login";
    }
}
