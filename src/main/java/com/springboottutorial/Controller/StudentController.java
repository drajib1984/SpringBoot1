package com.springboottutorial.Controller;

import com.springboottutorial.Entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/stu")
    public Student getDetails(){
        return new Student("Rajib","Das",101);
    }

    @GetMapping("/stu-list")
    public List<Student> getAllStudents(){
        List<Student> studentList= Arrays.asList(new Student("Ranjit","Das",102),
                new Student("Ira","Das",103),
                new Student("Ananya","Biswas",104),
                new Student("Rajib","Das",101));
        return studentList;
    }
    @GetMapping("/stu/{firstName}/{lastName}/{id}")
    public Student getStudentByIdAndLastName
            (@PathVariable("firstName") String FIRSTNAME,@PathVariable("lastName") String LASTNAME,@PathVariable("id") int identity){
        return new Student(FIRSTNAME,LASTNAME,identity);
    }
    @GetMapping("/stu/query")
    public Student queryParam
            (@RequestParam("firstName") String firstName,
             @RequestParam("lastName") String lastName,
             @RequestParam("id") int id){
        return new Student(firstName, lastName, id);
    }
}
