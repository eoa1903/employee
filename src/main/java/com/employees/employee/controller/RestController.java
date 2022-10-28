package com.employees.employee.controller;

import com.employees.employee.entity.Employee;
import com.employees.employee.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;

@org.springframework.web.bind.annotation.RestController
//@CrossOrigin(origins ="http://localhost:4200")
@Slf4j
public class RestController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping("/all")
    public ResponseEntity<Iterator<Employee>> getAllEmployees(){
        return new ResponseEntity<>( employeeRepository.findAll().iterator(), HttpStatus.ACCEPTED);
    }
    @PostMapping("/save")
    public ResponseEntity<String> saveEmployee(@Validated @RequestBody Employee employee){
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
