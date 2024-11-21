package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Employee;
import com.springboot.repository.EmployeeRepository;

@Service
public class EmployeeService
{
    @Autowired
    private EmployeeRepository Repository;

    public List<Employee> findAll()
    {
       return Repository.findAll();
    }

    public Employee findById(int id)
    {
        return Repository.findById(id);
    }
}
