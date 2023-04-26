package com.Online_Education_Platform.Online_Education_Platform.Services;

import com.Online_Education_Platform.Online_Education_Platform.Models.Student;
import com.Online_Education_Platform.Online_Education_Platform.Repositories.Student_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class Student_Service {
    @Autowired
    Student_Repository student_repository;
    public List<Student> getAllStudents() {

        return student_repository.findAll();
    }
    public Student getStudentById(Integer id) {

        return student_repository.findById(id).get();
    }
}
