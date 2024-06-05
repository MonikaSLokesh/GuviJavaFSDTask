package com.example.DemoApplication.controller;

import com.example.DemoApplication.entity.Employee;
import com.example.DemoApplication.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/")
@Api(tags = "Employee Management")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @ApiOperation("Display the Employee form")
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("employee", new Employee());
        return "index"; // Thymeleaf template name
    }

    @ApiOperation("Save an Employee")
    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute Employee employee) {
        employeeRepository.save(employee);
        return "redirect:/displayAll"; // Redirect to displayAll mapping
    }

    @ApiOperation("Display all Employees")
    @GetMapping("/displayAll")
    public String displayAllEmployees(Model model) {
        model.addAttribute("employees", employeeRepository.findAll());
        return "displayAll"; // Thymeleaf template name
    }

    @ApiOperation("Display Employee by ID")
    @GetMapping("/display/{id}")
    public String displayEmployee(@PathVariable("id") String id, Model model) {
        model.addAttribute("employee", employeeRepository.findById(id).orElse(null));
        return "displayEmployee"; // Thymeleaf template name
    }
}
