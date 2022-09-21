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
@Table(name = "Student_table")
public class Candidate {
    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private Long studentId;
    @Column(name = "student_firstName")
    private String firstName;
    @Column(name = "student_lastName")
    private String lastName;
    @Column(name = "student_email", nullable = false)
    private String emailId;
    @Embedded
    private Guardian guardian;

}
