package com.springboottutorial.Department.Service;

import com.springboottutorial.Department.Entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    public Department saveDepartment(Department department);
    public List<Department> getAllDepartment();
    public Optional<Department> getDepartmentById(long departmentId);
    public void deleteDepartmentById(Long departmentId);
    public Department updateDepartment(Long departmentId,Department department);
    public Department getDepartmentByName(String departmentName);
}
