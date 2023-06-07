package com.Online_Education_Platform.Online_Education_Platform.Services;

import com.Online_Education_Platform.Online_Education_Platform.Models.Instructor;
import com.Online_Education_Platform.Online_Education_Platform.Repositories.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class InstructorService {
    @Autowired
    InstructorRepository instructorRepository;
    public List<Instructor> getAllInstructors() {

        return instructorRepository.findAll();
    }
    public Instructor getInstructorById(Integer id) {

        return instructorRepository.findById(id).get();
    }
}
