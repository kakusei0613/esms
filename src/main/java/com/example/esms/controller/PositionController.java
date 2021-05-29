package com.example.esms.controller;

import com.example.esms.domain.Position;
import com.example.esms.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/position")
public class PositionController {
    @Autowired
    IPositionService positionService;
    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("positions", positionService.selectAll());
        return "/position/list";
    }
    @RequestMapping("/add")
    public String add(Model model, Position record) {
        positionService.insert(record);
        return "redirect:/position/list";
    }
    @RequestMapping("/delete")
    public String delete(Model model, Integer id) {
        positionService.deleteById(id);
        return "redirect:/position/list";
    }
}
