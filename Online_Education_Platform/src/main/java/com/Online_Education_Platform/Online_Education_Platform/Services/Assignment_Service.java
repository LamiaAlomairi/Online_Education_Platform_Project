package com.Online_Education_Platform.Online_Education_Platform.Services;

import com.Online_Education_Platform.Online_Education_Platform.Models.Assignment;
import com.Online_Education_Platform.Online_Education_Platform.Repositories.Assignment_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Assignment_Service {
    @Autowired
    Assignment_Repository assignment_repository;
    public List<Assignment> getAllAssignments() {

        return assignment_repository.findAll();
    }
    public Assignment getAssignmentById(Integer id) {

        return assignment_repository.findById(id).get();
    }
}
