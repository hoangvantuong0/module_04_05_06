package com.example.borrow_book.controller;


import com.example.borrow_book.model.Book;
import com.example.borrow_book.model.CardBorrow;
import com.example.borrow_book.service.IBookService;
import com.example.borrow_book.service.ICardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class BookController {
    @Autowired
    IBookService bookService;
    @Autowired
    ICardService cardService;

    @GetMapping("/book")
    public String showListBook(Model model) {
        model.addAttribute("bookList", bookService.findAll());
        return "book/list";
    }

    @GetMapping("/create-book")
    public String showCreateForm(Model model) {
        model.addAttribute("book", new Book());
        return "/book/create";
    }

    @PostMapping("/create-book")
    public String saveBook(@Valid @ModelAttribute("book") Book book, Model model) {
        bookService.save(book);
        model.addAttribute("book", book);
        model.addAttribute("message", "New book created successfully");
        return "redirect:book";
    }

    @GetMapping("/borrow-book/{id}")
    public String showFormBorrow(@PathVariable Integer id, Model model) {
        Optional< Book > book = bookService.findById(id);
        if (book.get().getNumber() != 0) {
            model.addAttribute("book", book.get());
            return "/book/detail";

        } else {
            return "/error.404";
        }
    }

    @PostMapping("/borrow")
    public String borrowBook(@ModelAttribute("book") Book book, Model model,
                             RedirectAttributes redirectAttributes) {
        System.out.println(book.getId());
        book.setNumber(book.getNumber() - 1);
        bookService.save(book);
        bookService.addBorrow(book);
        redirectAttributes.addFlashAttribute("message", "Borrow successfully");
        return "redirect:book";
    }

    @GetMapping("/return-book/{id}")
    public String showFormReturn(@PathVariable Integer id, Model model) {
        Optional< Book > book = bookService.findById(id);
        if (book != null) {
            model.addAttribute("book", book.get());
            return "/book/return";
        } else {
            return "/error.404";
        }
    }

    @PostMapping("/return")
    public String returnBook(@ModelAttribute("book") Book book,
                             @RequestParam String code,
                             Model model,
                             RedirectAttributes redirectAttributes) {
        if (cardService.returnBook(book, Integer.parseInt(code))) {
            redirectAttributes.addFlashAttribute("message", "Return successfully");
            return "redirect:book";
        }else {
            redirectAttributes.addFlashAttribute("message", "Not found your book borrow");
            return "redirect:book";
        }
    }

    @GetMapping("/borrow-list")
    public String showListBorrow(Model model) {
        model.addAttribute("cardBorrowList", cardService.findAll());
        return "borrow/list";
    }
}
