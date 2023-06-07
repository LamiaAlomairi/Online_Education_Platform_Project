package com.Online_Education_Platform.Online_Education_Platform.Controllers;

import com.Online_Education_Platform.Online_Education_Platform.Models.Course;
import com.Online_Education_Platform.Online_Education_Platform.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "course")
public class CourseController {
    //    http://localhost:8080/course/getAll
    @Autowired
    CourseService courseService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Course> getAllCourses() {

        return courseService.getAllCourses();
    }
    @GetMapping(value = "getById")
    public Course getCourseById(@RequestParam Integer id) {

        return courseService.getCourseById(id);
    }
}
