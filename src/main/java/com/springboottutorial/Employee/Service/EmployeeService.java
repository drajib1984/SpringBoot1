package com.springboottutorial.Employee.Service;

import com.springboottutorial.Employee.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);

    public List<Employee> getAllEmployee();

    public Employee getById(long id);

    public Employee updateEmployee(Employee employee);

    public void deleteEmployee(long id);
}
