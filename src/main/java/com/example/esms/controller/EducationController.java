package com.example.esms.controller;

import com.example.esms.domain.Education;
import com.example.esms.service.IEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/education")
public class EducationController {
    @Autowired
    IEducationService educationService;

    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("educations", educationService.selectAll());
        return "/education/list";
    }

    @RequestMapping("/add")
    public String insert(Model model, Education record) {
        educationService.insert(record);
        return "redirect:/education/list";
    }

    @RequestMapping("/delete")
    public String delete(Model model, Integer id) {
        educationService.deleteById(id);
        return "redirect:/education/list";
    }
}
