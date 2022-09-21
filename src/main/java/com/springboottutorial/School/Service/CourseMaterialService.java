package com.springboottutorial.School.Service;

import com.springboottutorial.School.Entity.CourseMaterial;
import com.springboottutorial.School.Repository.CourseMaterialRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
public interface CourseMaterialService {

    public CourseMaterial saveCourseMaterial(CourseMaterial courseMaterial);

}
