package com.employees.employee.controller;

import com.employees.employee.entity.Employee;
import com.employees.employee.repository.EmployeeRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

@RestController
//@CrossOrigin(origins ="http://localhost:4200")
@Slf4j
public class MainController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping("/all")
    public ResponseEntity<Iterator<Employee>> getAllEmployees(){
        return new ResponseEntity<>( employeeRepository.findAll().iterator(), HttpStatus.ACCEPTED);
    }
    @PostMapping("/save")
    public ResponseEntity<String> saveEmployee(@RequestBody Employee employee){
        log.info(String.valueOf(employee));
        employeeRepository.save(employee);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    @PostMapping("/update")
    public ResponseEntity<String> updateEmployee(@RequestBody Employee employee){
        log.info(String.valueOf(employee));
        employeeRepository.save(employee);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    @PostMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id){
        employeeRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
