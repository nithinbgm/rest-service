package com.example.rest_service;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
        employees.add(new Employee(1, "John", "Doe", "john.doe@example.com", "Software Engineer"));
        employees.add(new Employee(2, "Jane", "Smith", "jane.smith@example.com", "Product Manager"));

    }

    public List<Employee> getEmployees() {
        return employees;
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
}
