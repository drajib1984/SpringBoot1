package com.springboottutorial.Department.ServiceImpl;

import com.springboottutorial.Department.Entity.Department;
import com.springboottutorial.Department.Repository.DepartmentRepository;
import com.springboottutorial.Department.Service.DepartmentService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Data
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentRepository departmentRepository;
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
    @Override
    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }
    @Override
    public Optional<Department> getDepartmentById(long departmentId) {
        return departmentRepository.findById(departmentId);
    }
    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }
    @Override
    public Department updateDepartment(Long departmentId,Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartmentByName(String departmentName) {
        return departmentRepository.getDepartmentByDepartmentName(departmentName);
    }


}
