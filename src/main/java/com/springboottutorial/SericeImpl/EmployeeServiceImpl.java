package com.springboottutorial.SericeImpl;

import com.springboottutorial.Entity.Employee;
import com.springboottutorial.Exception.ResourceNotFound;
import com.springboottutorial.Repository.EmployeeRepository;
import com.springboottutorial.Service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Data
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    @Override
    public Employee saveEmployee(Employee employee) {
       return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getById(long id) {
        return employeeRepository.findById(id)
                .orElseThrow(()->new ResourceNotFound("Employee","Id",id));
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(long id) {
       employeeRepository.findById(id)
               .orElseThrow(()-> new ResourceNotFound("Employee","Id",id));
       employeeRepository.deleteById(id);
    }


}

