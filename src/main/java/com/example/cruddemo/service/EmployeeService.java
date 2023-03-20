package com.example.cruddemo.service;

import com.example.cruddemo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    List<Employee> findAll();

    Employee findByID(int id);

    Employee save(Employee employee);

    void deleteByID(int id);
}
