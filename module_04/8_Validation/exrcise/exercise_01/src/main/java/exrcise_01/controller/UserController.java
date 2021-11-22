package exrcise_01.controller;

import exrcise_01.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class UserController {
    @GetMapping("/validate")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "/views/form";
    }

    @PostMapping("create")
    public String showResult(@Valid @ModelAttribute("user") User user,
                             BindingResult bindingResult,
                             Model model) {
        new User().validate(user,bindingResult);
        if (bindingResult.hasErrors()) {
            return "/views/form";
        }
        return "/views/result";
    }
}