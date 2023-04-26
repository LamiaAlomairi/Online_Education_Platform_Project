package com.Online_Education_Platform.Online_Education_Platform.Services;

import com.Online_Education_Platform.Online_Education_Platform.Models.Course;
import com.Online_Education_Platform.Online_Education_Platform.Repositories.Course_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class Course_Service {
    @Autowired
    Course_Repository course_repository;
    public List<Course> getAllCourses() {

        return course_repository.findAll();
    }
    public Course getCourseById(Integer id) {

        return course_repository.findById(id).get();
    }
}
