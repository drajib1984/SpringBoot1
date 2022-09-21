package com.springboottutorial.School.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "teacher")
public class Teacher {
    @Id
    @SequenceGenerator(name = "teacher_sequence", sequenceName = "teacher_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teacher_sequence")
    private long teacherId;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "teacher",cascade = CascadeType.ALL)
    private List<Course> course;
   }