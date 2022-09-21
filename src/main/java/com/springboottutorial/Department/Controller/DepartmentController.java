package com.springboottutorial.Department.Controller;

import com.springboottutorial.Department.Entity.Department;
import com.springboottutorial.Department.Service.DepartmentService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
            return new ResponseEntity<Department>(HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/get-dept")
    public ResponseEntity<List<Department>> getAllDepartment(){
        if (!departmentService.getAllDepartment().isEmpty()) {
            return new ResponseEntity<List<Department>>(departmentService.getAllDepartment(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<List<Department>>(HttpStatus.NO_CONTENT);
        }
    }
    @GetMapping("/get-dept/{id}")
    public ResponseEntity<Optional<Department>>getDepartmentById(@PathVariable("id") Long departmentId){
        if (departmentService.getDepartmentById(departmentId).isPresent()) {
            return new ResponseEntity<Optional<Department>>
                    (departmentService.getDepartmentById(departmentId),HttpStatus.OK);
        }
        else {
            return new ResponseEntity<Optional<Department>>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/delete-dept/{id}")
    public ResponseEntity<?> deleteDepartmentById(@PathVariable("id") Long departmentId){
        try {
            departmentService.deleteDepartmentById(departmentId);
            return new ResponseEntity<String>("Department deleted successfully",HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<String>("No data available to delete",HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/update-dept/{id}")
    public ResponseEntity<Department>updateDepartment
            (@PathVariable("id") Long departmentId,@RequestBody Department department){
        return new ResponseEntity<Department>(departmentService.saveDepartment(department),HttpStatus.OK);
    }
    @GetMapping("/get-dept/name/{name}")
    public ResponseEntity<Department>getDepartmentByName(@PathVariable("name") String departmentName){
        return new ResponseEntity<Department>
                (departmentService.getDepartmentByName(departmentName),HttpStatus.OK);
    }

}
