package com.Online_Education_Platform.Online_Education_Platform.Controllers;

import com.Online_Education_Platform.Online_Education_Platform.Models.Course;
import com.Online_Education_Platform.Online_Education_Platform.Services.Course_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "course")
public class Course_Controller {
    //    http://localhost:8080/course/getAll
    @Autowired
    Course_Service course_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Course> getAllCourses() {

        return course_service.getAllCourses();
    }
    @GetMapping(value = "getById")
    public Course getCourseById(@RequestParam Integer id) {

        return course_service.getCourseById(id);
    }
}
