package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
public class EmployeeController {
	@RequestMapping(value = "/get/employees", method = RequestMethod.GET)
    public String getEmployees() {
        final Employee employee = new Employee("Tech Geek Next Employee");
        return "Hello "+ employee.getName();
    }
	
	@RequestMapping(value = "/save/employees", method = RequestMethod.POST)
    public String saveEmployees() {
        final Employee employee = new Employee("Tech Geek Next Employee");
        return "Hello "+ employee.getName();
    }

}
