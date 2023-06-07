package com.Online_Education_Platform.Online_Education_Platform.Services;

import com.Online_Education_Platform.Online_Education_Platform.Models.Course;
import com.Online_Education_Platform.Online_Education_Platform.Repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;
    public List<Course> getAllCourses() {

        return courseRepository.findAll();
    }
    public Course getCourseById(Integer id) {

        return courseRepository.findById(id).get();
    }
}
