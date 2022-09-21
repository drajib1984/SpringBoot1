package com.springboottutorial.Department.Controller;

import com.springboottutorial.Department.Entity.Department;
import com.springboottutorial.Department.Service.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
@WebMvcTest(DepartmentController.class)
class DepartmentControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private DepartmentService departmentService;

    private Department department;

    @BeforeEach
    void setUp(){
        department=Department.builder()
                .departmentAddress("Ahmedabad")
                .departmentId(1L)
                .departmentCode("IT-06")
                .departmentName("Information Technology")
                .build();
    }

    @Test
    void saveDepartment() throws Exception {
        Department departmentInput = Department.builder()
                .departmentAddress("Ahmedabad")
                .departmentCode("IT-06")
                .departmentName("Information Technology")
                .build();
        Mockito.when(departmentService.saveDepartment(departmentInput)).thenReturn(department);
        mockMvc.perform(MockMvcRequestBuilders.post("/api/save")
                .contentType(MediaType.APPLICATION_JSON).content("""
                        {
                            "departmentName":"Information Technology",
                        "departmentAddress":"Ahmedabad",
                        "departmentCode":"IT-06"
                        }""")).andExpect(MockMvcResultMatchers.status().isOk());
    }


    @Test
    void getDepartmentById() {
    }
}