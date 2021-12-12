package com.example.final_exam.controller;

import com.example.final_exam.model.Film;
import com.example.final_exam.model.ShowTime;
import com.example.final_exam.service.IFilmService;
import com.example.final_exam.service.IShowTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/show")
public class ShowTimeController {

    @Autowired
    IFilmService filmService;
    @Autowired
    IShowTimeService showTimeService;

    @ModelAttribute("filmList")
    public Iterable<Film> filmList(Model model) {
        return filmService.findAll();
    }
//    @GetMapping("/test")
//    public String test(Model model){
//        model.addAttribute("film", filmService.findAll());
//        return "test";
//    }

    @GetMapping
    public String showFilmList(@PageableDefault(size = 5) Pageable pageable, Model model) {
        Page<ShowTime> showTimePage = showTimeService.findAll(pageable);
        model.addAttribute("showTimePage", showTimePage);
        return "show/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        System.out.println(filmService.findAll());
        model.addAttribute("showTime", new ShowTime());
        model.addAttribute("filmList", filmService.findAll());
        for (Film film: filmService.findAll()) {
            System.out.println(film.toString());
        }
        return "show/create";
    }

    @PostMapping("/create")
    public String createShowTime(@Valid @ModelAttribute("showTime") ShowTime showTime, BindingResult bindingResult,
                                 Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "show/create";
        } else {
            if (showTimeService.existsById(showTime.getId())) {
                model.addAttribute("msg", "duplicated name");
                return "show/create";
            } else {
                showTimeService.save(showTime);
                redirectAttributes.addFlashAttribute("message", "Create successfully!");
                return "redirect:/show";
            }
        }


    }

    @GetMapping("/edit/{id}")
    public String showFormEdit(@PathVariable String id, Model model) {
        Optional<ShowTime> showTime = showTimeService.findById(id);
        if (showTime.isPresent()) {
            model.addAttribute("showTime", showTime.get());
            return "show/edit";
        } else {
            return "error.404";
        }
    }

    @PostMapping("/edit")
    public String editCustomer(@ModelAttribute("showTime") ShowTime showTime,
                               Model model, RedirectAttributes redirectAttributes) {
        showTimeService.save(showTime);
        redirectAttributes.addFlashAttribute("message", "Edit successfully");
        return "redirect:/show";
    }

    @GetMapping("/delete/{id}")
    public String showDeleteShow(@PathVariable String id, Model model) {
        Optional<ShowTime> showTime = showTimeService.findById(id);
        model.addAttribute("showTime", showTime.get());
        return "show/delete";
    }

    @PostMapping("/delete")
    public String deleteShow(@RequestParam String id, Model model) {
        showTimeService.remove(id);
        return "redirect:/show";
    }

    @PostMapping("search")
    public String search(@RequestParam @PageableDefault(size = 5) String name,
                         Model model, Pageable pageable) {
        Page<ShowTime> showTimePage = showTimeService.searchByName(name, pageable);
        model.addAttribute("showTimePage", showTimePage);
        return "show/list";
    }
}