package com.employees.employee.controller;

import com.employees.employee.entity.Employee;
import com.employees.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
public class MainController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/all")
    public List<Employee> getAllEmployees(){
        return (List<Employee>) employeeRepository.findAll();
    }
}
