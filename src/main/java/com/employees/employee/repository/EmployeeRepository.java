package com.employees.employee.repository;

import org.springframework.data.repository.CrudRepository;
import com.employees.employee.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}
