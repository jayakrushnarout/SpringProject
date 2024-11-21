package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Employee;
import com.springboot.service.EmployeeService;

@RestController
@RequestMapping(value = "Employee")
public class EmployeeController
{
    @Autowired
    private EmployeeService service;

    @GetMapping("/getAll")
    public List<Employee> getEmployee()
    {
        return service.findAll();
    }


    @GetMapping("/getById")
    public Employee findById(@RequestParam int id)
    {
        return service.findById(id);
    }
    
}