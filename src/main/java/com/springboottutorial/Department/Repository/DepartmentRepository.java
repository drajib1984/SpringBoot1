package com.springboottutorial.Department.Repository;

import com.springboottutorial.Department.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    public Department getDepartmentByDepartmentName(String departmentName);
    public Department findDepartmentByDepartmentNameIgnoreCase(String departmentName);
}
