package com.employees.employee.service;

import com.employees.employee.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    public List<Employee> getAllEmployee();
    public String saveEmployee(Employee employee);
}
