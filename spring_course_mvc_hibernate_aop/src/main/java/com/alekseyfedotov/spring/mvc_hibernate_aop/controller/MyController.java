package com.alekseyfedotov.spring.mvc_hibernate_aop.controller;

import com.alekseyfedotov.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.alekseyfedotov.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private EmployeeDAO employeeDAO;


    @RequestMapping("/")
    public String showAllEmps(Model model){
        List<Employee> allEmps = employeeDAO.getAllEmployees();
        model.addAttribute("allEmps", allEmps);
        return "all-employees";
    }

}
