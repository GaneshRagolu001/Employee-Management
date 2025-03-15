package com.luv2code.springboot.employeemanagement.service;

import com.luv2code.springboot.employeemanagement.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    Employee deleteById(int theId);

}
