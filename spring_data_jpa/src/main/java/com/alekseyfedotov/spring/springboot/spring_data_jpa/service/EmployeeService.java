package com.alekseyfedotov.spring.springboot.spring_data_jpa.service;


import com.alekseyfedotov.spring.springboot.spring_data_jpa.entity.Employee;
import org.dom4j.io.ElementModifier;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);

    public List<Employee> findAllByName(String name);
}
