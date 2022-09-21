package com.springboottutorial.School.Controller;

import com.springboottutorial.School.Entity.CourseMaterial;
import com.springboottutorial.School.Service.CourseMaterialService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
@AllArgsConstructor
@Builder
@RequestMapping("/api/course-material")
public class CourseMaterialController {
    private CourseMaterialService courseMaterialService;
    @PostMapping("/save")
    public ResponseEntity<CourseMaterial> saveCourseMaterial(@RequestBody CourseMaterial courseMaterial){
        return new ResponseEntity<CourseMaterial>
                (courseMaterialService.saveCourseMaterial(courseMaterial), HttpStatus.CREATED);
    }
}
