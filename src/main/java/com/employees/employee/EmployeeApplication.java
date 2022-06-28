package com.employees.employee;

import com.employees.employee.entity.Employee;
import com.employees.employee.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class EmployeeApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

//	@Bean
//	CommandLineRunner init(EmployeeRepository employeeRepository){
//
//		salary+=10000;
//		return args -> {
//			Stream.of("David", "Johnson", "John", "Mary", "Tolu").forEach( name ->{
//							Employee employee = new Employee(name, name.toLowerCase()+"@yahoo.com");
//							employeeRepository.save(employee);
//			});
//			employeeRepository.findAll().forEach(System.out::println);
//		};
//	}
}
