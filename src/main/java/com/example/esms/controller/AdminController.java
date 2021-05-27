package com.example.esms.controller;

import com.example.esms.domain.Admin;
import com.example.esms.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
    @Autowired
    IAdminService adminService;
    @RequestMapping("login")
    public String login(Model model, String username, String password) {
        Admin loginUser = adminService.selectUser(username, password);
        System.out.println(loginUser);
        if(loginUser == null) {
            return "redirect:/login.jsp";
        }
        else {
            model.addAttribute("loginUser",loginUser);
            return "redirect:/employee/list.do";
        }
    }
}
