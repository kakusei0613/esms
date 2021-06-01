package com.example.esms.controller;

import com.example.esms.query.SalaryQueryObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/salary")
public class SalaryController {
    @RequestMapping("/list")
    public String list(Model model, @ModelAttribute("sqo") SalaryQueryObject sqo) {
        return "/salary/list";
    }
}
