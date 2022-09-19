package com.springboottutorial.Department.Controller;

import com.springboottutorial.Department.Entity.Department;
import com.springboottutorial.Department.Service.DepartmentService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@Data
@RequestMapping("/api")
public class DepartmentController {
    private DepartmentService departmentService;
    @PostMapping("/save")
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department){
        try {
            return new ResponseEntity<Department>(departmentService.saveDepartment(department), HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity<Department>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
