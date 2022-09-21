package com.springboottutorial.School.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
    @Id
    @SequenceGenerator(name ="course_sequence", sequenceName = "course_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_sequence")
    private long courseId;
    private String courseTitle;
    private int courseCredit;
    @OneToOne(mappedBy = "course",cascade = CascadeType.ALL)
    private CourseMaterial courseMaterial;
}
