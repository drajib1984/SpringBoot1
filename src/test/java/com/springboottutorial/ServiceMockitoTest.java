package com.springboottutorial;

import com.springboottutorial.Employee.Entity.Employee;
import com.springboottutorial.Employee.Repository.EmployeeRepository;
import com.springboottutorial.Employee.SericeImpl.EmployeeServiceImpl;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest(classes ={ServiceMockitoTest.class} )
public class ServiceMockitoTest {
    @Mock
    EmployeeRepository employeeRepository;
    @InjectMocks
    EmployeeServiceImpl employeeService;

    public List<Employee> myemployees = Arrays.asList
            (new Employee(101,"Rajib","Das","drajib1984@gmail.com",2000),
                    new Employee(102,"Ranjit","Das","dranjit1947@gmail.com",5000),
                    new Employee(103,"Ananya","Biswas","anaya.sanhita@gmail.com",10000));

    @Test
    @Order(1)
    public void test_getAllEmployees(){
        when(employeeRepository.findAll()).thenReturn(myemployees);
        assertEquals(3,employeeService.getAllEmployee().size());
    }

    }

