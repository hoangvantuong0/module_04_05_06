package com.example.furama.controller;

import com.example.furama.model.customer.Customer;
import com.example.furama.model.customer.CustomerType;
import com.example.furama.service.customer.ICustomerService;
import com.example.furama.service.customer.ICustomerTypeService;
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
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    ICustomerService customerService;
    @Autowired
    ICustomerTypeService customerTypeService;

    @ModelAttribute("customerTypeList")
    public Iterable<CustomerType> customerTypeList(Model model) {
        return customerTypeService.findAll();
    }

    @GetMapping
    public String showListCustomer(@PageableDefault(size = 5) Pageable pageable, Model model) {
        // Sắp xếp tên theo thứ tự tăng dần
        Sort sort = Sort.by("name").ascending();
        Page<Customer> customerPage = customerService.findAll(pageable);
        model.addAttribute("customerPage", customerPage);
        return "customer/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer/create";
    }

    @PostMapping("/create")
    public String createCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult,
                                 Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "customer/create";
        } else {
            customerService.save(customer);
            redirectAttributes.addFlashAttribute("message", "Create successfully!");
            return "redirect:/customer";
        }
    }


    @GetMapping("/edit/{id}")
    public String showFormEdit(@PathVariable String id, Model model) {
        Optional<Customer> customer = customerService.findById(id);
        if (customer.isPresent()) {
            model.addAttribute("customer", customer.get());
            return "customer/edit";
        } else {
            return "error.404";
        }
    }

    @PostMapping("/edit")
    public String editCustomer(@ModelAttribute("customer") Customer customer,
                               Model model, RedirectAttributes redirectAttributes) {
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("message", "Edit customer successfully");
        return "redirect:/customer";
    }

    @GetMapping("/delete/{id}")
    public String showDeleteCustomer(@PathVariable String id, Model model) {
        Optional<Customer> customer = customerService.findById(id);
        model.addAttribute("customer", customer.get());
        return "customer/delete";
    }

    @PostMapping("/delete")
    public String deleteCustomer(@RequestParam String id, Model model) {
        customerService.remove(id);
        return "redirect:/customer";
    }

    @PostMapping("search")
    public String search(@RequestParam @PageableDefault(size = 5) String name,
                         Model model, Pageable pageable) {
        Page<Customer> customerPage = customerService.searchByName(name, pageable);
        model.addAttribute("customerPage", customerPage);
        return "customer/list";
    }

}






















