package com.springboottutorial.School.Controller;

import com.springboottutorial.School.Entity.Teacher;
import com.springboottutorial.School.Service.TeacherService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Builder
@Data
@RequestMapping("/api/teacher")
public class TeacherController {
    private TeacherService teacherService;
    @PostMapping("/save")
    public ResponseEntity<Teacher> saveTeacher(Teacher teacher){
        return new ResponseEntity<Teacher>(teacherService.saveTeacher(teacher), HttpStatus.CREATED);
    }
}
