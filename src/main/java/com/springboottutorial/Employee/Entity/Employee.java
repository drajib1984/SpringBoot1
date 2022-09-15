package com.springboottutorial.Employee.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "emp")
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "first_name",nullable = false, length = 300)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "emp_email")
    private String email;
    @Column(name = "emp_salary",nullable = false)
    private int salary;

    // in postman during crud process, use the variables defined in Java, don't use the name=" XXX"
}
