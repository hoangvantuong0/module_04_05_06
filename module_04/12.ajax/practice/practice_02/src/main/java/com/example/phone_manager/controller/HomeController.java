package com.example.phone_manager.controller;


import com.example.phone_manager.model.Smartphone;
import com.example.phone_manager.repository.ISmartphoneRepository;
import com.example.phone_manager.service.ISmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showIndex() {
        return "/index";
    }
}