package com.controller;


import com.repository.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    private Dictionary dictionary;


    @GetMapping
    public String dictionary() {
        return "list";
    }

    @PostMapping
    public String findWord(Model model, @RequestParam String word) {
        String vocabulary = dictionary.search(word);
        if (vocabulary != null) {
            model.addAttribute("vocabulary", vocabulary);
            return "list";
        } else {
            model.addAttribute("error", 1);
            return "list";
        }
    }
}