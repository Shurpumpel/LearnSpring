package com.alekseyfedotov.spring.rest;

import com.alekseyfedotov.spring.rest.configuration.MyConfig;
import com.alekseyfedotov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication"
        ,Communication.class);

//        List<Employee> employees = communication.getAllEmployees();
//        System.out.println(employees);
//        **************************************

//        Employee employee = communication.getEmployee(3);
//        System.out.println(employee);
//        ***************************************

//        Employee emp = new Employee("Sveta", "Sokolova"
//                , "IT", 900);
//        emp.setId(5);
//        communication.saveEmployee(emp);
//        ***************************************

          communication.deleteEmploye(5);
    }
}
