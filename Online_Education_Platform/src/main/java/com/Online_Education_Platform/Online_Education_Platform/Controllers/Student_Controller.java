package com.Online_Education_Platform.Online_Education_Platform.Controllers;

import com.Online_Education_Platform.Online_Education_Platform.Models.Student;
import com.Online_Education_Platform.Online_Education_Platform.Services.Student_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "student")
public class Student_Controller {
    //    http://localhost:8080/student/getAll
    @Autowired
    Student_Service student_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Student> getAllStudents() {

        return student_service.getAllStudents();
    }
    @GetMapping(value = "getById")
    public Student getStudentById(@RequestParam Integer id) {

        return student_service.getStudentById(id);
    }
}
