package com.springboottutorial.School.ServiceImpl;

import com.springboottutorial.School.Entity.CourseMaterial;
import com.springboottutorial.School.Repository.CourseMaterialRepository;
import com.springboottutorial.School.Service.CourseMaterialService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Data
@Builder
public class CourseMaterialServiceImpl implements CourseMaterialService {
    private CourseMaterialRepository courseMaterialRepository;

    @Override
    public CourseMaterial saveCourseMaterial(CourseMaterial courseMaterial) {
        return courseMaterialRepository.save(courseMaterial);
    }
}
