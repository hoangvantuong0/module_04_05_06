package codegym.controller;

import codegym.repository.Dictionary;
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
        return "dictionary";
    }

    @PostMapping
    public String findWord(Model model, @RequestParam String word) {
        String vocabulary = dictionary.search(word);
        if (vocabulary != null) {
            model.addAttribute("vocabulary", vocabulary);
            return "dictionary";
        } else {
            model.addAttribute("error", 1);
            return "dictionary";
        }
    }
}

//@Controller
//public class DictionaryController {
//    @Autowired
//    private DictionaryService dictionaryService;
//
//    @GetMapping("/")
//    public String homePage(){
//        return "index";
//    }
//
//    @GetMapping("/search")
//    public String search(@RequestParam String input, Model model){
//        String output = dictionaryService.search(input);
//        if (output!=null){
//            model.addAttribute("output",output);
//            return "index";
//        }else {
//            model.addAttribute("error",1);
//            return "index";
//        }
//    }
//}