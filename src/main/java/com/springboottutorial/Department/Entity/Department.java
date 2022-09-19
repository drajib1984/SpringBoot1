package com.springboottutorial.Department.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "department_table")
public class Department {
    @Id
    @SequenceGenerator(name = "department_id", sequenceName = "department_id",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "department_id")
    @Column(name = "dept_id")
    private long departmentId;
    @Column(name = "dept_name", nullable = false)
    private String departmentName;
    @Column(name = "dept_address", nullable = false)
    private String departmentAddress;
    @Column(name = "dept_code",nullable = false)
    private String departmentCode;
}
