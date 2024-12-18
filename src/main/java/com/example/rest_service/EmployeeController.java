package com.example.rest_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeManager employeeManager = new EmployeeManager();

    @GetMapping
    public List<Employee> getEmployees() {
        return employeeManager.getEmployees();
    }
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        employeeManager.addEmployee(employee);
        return employee;
    }

}
