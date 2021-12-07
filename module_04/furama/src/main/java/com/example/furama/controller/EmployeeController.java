package com.example.furama.controller;

import com.example.furama.model.employee.*;
import com.example.furama.service.employee.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    IEmployeeService employeeService;
    @Autowired
    IPositionService positionService;
    @Autowired
    IEducationDegreeService educationDegreeService;
    @Autowired
    IDivisionService divisionService;
    @Autowired
    IUserService userService;

    @ModelAttribute("positionList")
    public Iterable<Position> positionList() {
        return positionService.findAll();
    }

    @ModelAttribute("educationDegreeList")
    public Iterable<EducationDegree> educationDegreeList() {
        return educationDegreeService.findAll();
    }
        @ModelAttribute("divisionList")
        public Iterable<Division> divisionList () {
            return divisionService.findAll();
        }
        @ModelAttribute("userList")
    public Iterable<User> userList(){
        return userService.findAll();
        }

        @GetMapping
    public String showList(@PageableDefault(size = 5) Pageable pageable, Model model){
            Page<Employee> employeePage = employeeService.findAll(pageable);
            model.addAttribute("employeePage", employeePage);
            return "employee/list";
        }
        @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("employee", new Employee());
        return "employee/create";
        }
        @PostMapping("/create")
    public String createEmployee(@ModelAttribute("employee") Employee employee, Model model){
        employeeService.save(employee);
        return "redirect:/employee";
        }
}

























