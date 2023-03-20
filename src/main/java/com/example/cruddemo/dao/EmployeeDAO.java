package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findByID(int id);

    Employee save(Employee employee);

    void deleteByID(int id);

}
