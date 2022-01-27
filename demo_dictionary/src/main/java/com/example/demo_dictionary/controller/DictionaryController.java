package com.example.demo_dictionary.controller;

import com.example.demo_dictionary.model.Dictionary;
import com.example.demo_dictionary.service.dictionary.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

//@Controller
//@RequestMapping("/dictionary")
public class DictionaryController {

//    private List<Dictionary> dictionaries = new ArrayList<Dictionary>();
    @Autowired
    IDictionaryService dictionaryService;


//    webService
    @GetMapping("api/dictionary")
    public ResponseEntity<Page<Dictionary>> getAllDictionary(@RequestParam(defaultValue = "0") int page) {
        try {
            Pageable pageable = PageRequest.of(page, 10000000, Sort.by("id"));
            Page<Dictionary> dictionaryPage = dictionaryService.findAll(pageable);
            if (dictionaryPage.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(dictionaryPage, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("api/dictionary/{id}")
    public ResponseEntity<Dictionary> findDictionaryById(@PathVariable Integer id) {
        Optional<Dictionary> dictionary = dictionaryService.findById(id);
        if (dictionary.isPresent()) {
            return new ResponseEntity<>(dictionary.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("api/dictionary/{id}")
    public void deleteDictionary(@PathVariable Integer id) {
        dictionaryService.remove(id);
    }

    @PostMapping("api/dictionary")
    public ResponseEntity<?> saveDictionary(@RequestBody Dictionary dictionary, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        dictionaryService.save(dictionary);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("api/dictionary/{id}")
    public void updateDictionary(@RequestBody Dictionary dictionary) {
        dictionaryService.save(dictionary);
        }

    @GetMapping ("api/dictionary?{name}")
    public ResponseEntity<Page<Dictionary>> search(@PathVariable String name, Pageable pageable) {
        try {
            Page<Dictionary> dictionaryPage = dictionaryService.searchByName(name, pageable);
            if (dictionaryPage.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<Page<Dictionary>>(dictionaryPage, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}

//webservice
//
//    @PostMapping("search")
//    public String search(@RequestParam @PageableDefault(size = 5) String name,
//                         Model model, Pageable pageable) {
//        Page<Dictionary> dictionaryPage = dictionaryService.searchByName(name, pageable);
//        model.addAttribute("dictionaryPage", dictionaryPage);
//        return "dictionary/list";
//    }
//
//
//    @GetMapping
//    public String showList(@PageableDefault(size = 5) Pageable pageable, Model model) {
//        // Sắp xếp tên theo thứ tự tăng dần
////            Sort sort = Sort.by("name").ascending();
//        Page<Dictionary> dictionaryPage = dictionaryService.findAll(pageable);
//        model.addAttribute("dictionaryPage", dictionaryPage);
//        return "dictionary/list";
//    }
//
//
//    @GetMapping("/create")
//    public String showFormCreate(Model model) {
//        model.addAttribute("dictionary", new Dictionary());
//        return "dictionary/create";
//    }
//
//    @PostMapping("/create")
//    public String createCustomer(@ModelAttribute("dictionary") Dictionary dictionary, BindingResult bindingResult,
//                                 Model model, RedirectAttributes redirectAttributes) {
//        if (bindingResult.hasErrors()) {
//            return "dictionary/create";
//        } else {
//            dictionaryService.save(dictionary);
//            redirectAttributes.addFlashAttribute("message", "Create successfully!");
//            return "redirect:/dictionary";
//        }
//    }
//
//
//    @GetMapping("/edit/{id}")
//    public String showFormEdit(@PathVariable Integer id, Model model) {
//        Optional<Dictionary> dictionary = dictionaryService.findById(id);
//        if (dictionary.isPresent()) {
//            model.addAttribute("dictionary", dictionary.get());
//            return "dictionary/edit";
//        } else {
//            return "error.404";
//        }
//    }
//
//    @PostMapping("/edit")
//    public String edit(@ModelAttribute("dictionary") Dictionary dictionary,
//                       Model model, RedirectAttributes redirectAttributes) {
//        dictionaryService.save(dictionary);
//        redirectAttributes.addFlashAttribute("message", "Edit word successfully");
//        return "redirect:/dictionary";
//    }
//
//
//    @GetMapping("delete/{id}")
//    public String showDelete(@PathVariable Integer id, Model model) {
//        Optional<Dictionary> dictionary = dictionaryService.findById(id);
//        model.addAttribute("dictionary", dictionary.get());
//        return "dictionary/delete";
//
//    }
//
//    @PostMapping("/delete")
//    public String delete(@RequestParam Integer id, Model model) {
//        dictionaryService.remove(id);
//        return "redirect:/dictionary";
//    }
//
//}
