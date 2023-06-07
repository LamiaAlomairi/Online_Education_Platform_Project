package com.Online_Education_Platform.Online_Education_Platform.Services;

import com.Online_Education_Platform.Online_Education_Platform.Models.Assignment;
import com.Online_Education_Platform.Online_Education_Platform.Repositories.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentService {
    @Autowired
    AssignmentRepository assignmentRepository;
    public List<Assignment> getAllAssignments() {

        return assignmentRepository.findAll();
    }
    public Assignment getAssignmentById(Integer id) {

        return assignmentRepository.findById(id).get();
    }
}
