package com.springboottutorial.Department.ServiceImpl;

import com.springboottutorial.Department.Entity.Department;
import com.springboottutorial.Department.Repository.DepartmentRepository;
import com.springboottutorial.Department.Service.DepartmentService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Data
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentRepository departmentRepository;
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
