package com.example.DemoApplication.Service;


import com.example.DemoApplication.entity.Employee;
import com.example.DemoApplication.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Method to save an employee
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    // Method to retrieve all employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Method to retrieve an employee by ID
    public Optional<Employee> getEmployeeById(String id) {
        return employeeRepository.findById(id);
    }

    // Method to delete an employee by ID
    public void deleteEmployeeById(String id) {
        employeeRepository.deleteById(id);
    }
}
