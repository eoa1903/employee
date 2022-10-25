package com.employees.employee.controller;

import com.employees.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("index.html");
    }
    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView("/pages/listofemployee.html");
        modelAndView.addObject("employees",employeeService.getAllEmployee());
        return modelAndView;
    }
}
