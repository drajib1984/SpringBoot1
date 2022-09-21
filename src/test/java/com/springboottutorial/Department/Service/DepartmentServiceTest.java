package com.springboottutorial.Department.Service;

import com.springboottutorial.Department.Entity.Department;
import com.springboottutorial.Department.Repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DepartmentServiceTest {
    @Autowired
    private DepartmentService departmentService;
    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department=Department.builder()
                .departmentName("Sales").departmentAddress("Kolkata")
                .departmentCode("SAL_INDIA").departmentId(1L)
                .build();
        Mockito.when(departmentService.getDepartmentByName("Sales"))
                .thenReturn(department);
    }
    @Test
    public void test_getDepartmentByName(){
        String departmentName = "Sales";
        Department departmentByName = departmentService.getDepartmentByName(departmentName);
        assertEquals(departmentName,departmentByName.getDepartmentName());
    }
//    @BeforeEach
//    void setUp1(){
//        Department department=Department.builder()
//                .departmentName("Sales").departmentAddress("Kolkata")
//                .departmentCode("SAL_INDIA").departmentId(1L)
//                .build();
//    }
//    @Test
//    public void test_saveDepartment(){
//        List<Department> department= Arrays.asList
//                (new Department(1L,"Sales",
//                        "Kolkata","SAL_INDIA"));
//        Department save = departmentRepository.save(List<Department> department);
//        assertEquals(department.get().getDepartmentName(),"save");
//    }

}