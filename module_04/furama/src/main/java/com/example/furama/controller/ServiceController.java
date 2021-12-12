//package com.example.furama.controller;
//
//import com.example.furama.model.services.RentalType;
//import com.example.furama.model.services.ServiceType;
//import com.example.furama.model.services.Services;
//import com.example.furama.service.services.IRentalTypeService;
//import com.example.furama.service.services.IServiceService;
//import com.example.furama.service.services.IServiceTypeService;
//import com.sun.org.apache.xpath.internal.operations.Mod;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.web.PageableDefault;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//@RequestMapping("/service")
//public class ServiceController {
//    @Autowired
//    IServiceService serviceService;
//    @Autowired
//    IRentalTypeService rentalTypeService;
//    @Autowired
//    IServiceTypeService serviceTypeService;
//
//    @ModelAttribute("rentalTypeList")
//    public Iterable<RentalType> rentalTypeList(){
//        return rentalTypeService.findAll();
//    }
//    @ModelAttribute("serviceTypeList")
//    public Iterable<ServiceType> serviceTypeList(){
//        return serviceTypeService.findAll();
//    }
//
//    @RequestMapping
//    public String showList(@PageableDefault(size = 5)Pageable pageable, Model model){
//        Page<Services> servicesPage = serviceService.findAll(pageable);
//        model.addAttribute("servicePage", servicesPage);
//        return "service/list";
//    }
//@RequestMapping("/create")
//    public String showFormCreate(Model model){
//        model.addAttribute("service", new Services());
//        return "service/create";
//
//}
//}
