package com.springboottutorial.School.ServiceImpl;

import com.springboottutorial.School.Entity.Teacher;
import com.springboottutorial.School.Repository.TeacherRepository;
import com.springboottutorial.School.Service.TeacherService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@AllArgsConstructor
@Builder
@Service
public class TeacherServiceImpl implements TeacherService {
    private TeacherRepository teacherRepository;

    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
}
