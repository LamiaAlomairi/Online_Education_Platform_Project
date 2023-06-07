package com.Online_Education_Platform.Online_Education_Platform.Controllers;

import com.Online_Education_Platform.Online_Education_Platform.Models.Student;
import com.Online_Education_Platform.Online_Education_Platform.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "student")
public class StudentController {
    //    http://localhost:8080/student/getAll
    @Autowired
    StudentService studentService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Student> getAllStudents() {

        return studentService.getAllStudents();
    }
    @GetMapping(value = "getById")
    public Student getStudentById(@RequestParam Integer id) {

        return studentService.getStudentById(id);
    }
}
