package com.springboottutorial.School.Service;

import com.springboottutorial.School.Entity.Teacher;
import org.springframework.stereotype.Service;

@Service
public interface TeacherService {
    public Teacher saveTeacher(Teacher teacher);
}
