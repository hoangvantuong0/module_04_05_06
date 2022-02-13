package com.example.vikordic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
    @GetMapping("/home")
    public String homePage(Model model) {
        return "home";
    }
}