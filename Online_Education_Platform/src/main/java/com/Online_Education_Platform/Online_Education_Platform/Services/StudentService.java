package com.Online_Education_Platform.Online_Education_Platform.Services;

import com.Online_Education_Platform.Online_Education_Platform.Models.Student;
import com.Online_Education_Platform.Online_Education_Platform.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }
    public Student getStudentById(Integer id) {

        return studentRepository.findById(id).get();
    }
}
