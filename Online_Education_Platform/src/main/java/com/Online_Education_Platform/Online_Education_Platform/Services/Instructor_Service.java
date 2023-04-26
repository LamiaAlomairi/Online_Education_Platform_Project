package com.Online_Education_Platform.Online_Education_Platform.Services;

import com.Online_Education_Platform.Online_Education_Platform.Models.Instructor;
import com.Online_Education_Platform.Online_Education_Platform.Repositories.Instructor_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class Instructor_Service {
    @Autowired
    Instructor_Repository instructor_repository;
    public List<Instructor> getAllInstructors() {

        return instructor_repository.findAll();
    }
    public Instructor getInstructorById(Integer id) {

        return instructor_repository.findById(id).get();
    }
}
