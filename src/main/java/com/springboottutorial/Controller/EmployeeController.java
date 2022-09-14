package com.springboottutorial.Controller;

import com.springboottutorial.Entity.Employee;
import com.springboottutorial.Exception.ResourceNotFound;
import com.springboottutorial.Service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Data
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;


    //create employee details
    @PostMapping("/emp")
    public ResponseEntity<Employee> createEmployeeDetails(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
    }

    //get all employees
    @GetMapping("/emp-list")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return new ResponseEntity<List<Employee>>(employeeService.getAllEmployee(),HttpStatus.OK);
    }

    //get employee by id
    @GetMapping("/emp/{id}")
   public ResponseEntity<Employee> getById(@PathVariable("id") long id){
        return new ResponseEntity<Employee>(employeeService.getById(id),HttpStatus.OK);
    }

   // update employee
    @PutMapping("/emp/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.updateEmployee(employee),HttpStatus.OK);
    }

    //delete employee

    @DeleteMapping("/emp/delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable("id") long id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<String>("Data deleted successfully",HttpStatus.OK);
    }





}
