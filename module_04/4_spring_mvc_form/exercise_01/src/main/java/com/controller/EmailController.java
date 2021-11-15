package com.controller;

import com.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class EmailController {

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public ModelAndView getEmail(Model model){
        ModelAndView modelAndView = new ModelAndView("create");
        String[] languageList = new String[]{"Vietnamese","Chinese", "Korean", "English"};
        Integer[] pageSizeList = new Integer[]{10,20,30};
        model.addAttribute("pageSizeList",pageSizeList);
        model.addAttribute("languageList",languageList);
        modelAndView.addObject("languageList",languageList);
        modelAndView.addObject("pageSizeList",pageSizeList);
        modelAndView.addObject("email",new Email());
        return modelAndView;
    }

    @PostMapping(value = "/save")
    public String saveConfig(@ModelAttribute("email")Email email, Model model){
        model.addAttribute("email",email);
        return "/show";
    }
}
