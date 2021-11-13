package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class SandwichController {


    @GetMapping(value = "")
    public String Index(){
        return "index";
    }

    @GetMapping(value = "/save")
    public String save(@RequestParam(value = "condiments") String[] condiments, Model model){
        model.addAttribute("condiments",condiments);
        return "save";
    }
}
