package com.Online_Education_Platform.Online_Education_Platform.Services;

import com.Online_Education_Platform.Online_Education_Platform.Models.Grade;
import com.Online_Education_Platform.Online_Education_Platform.Repositories.Grade_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class Grade_Service {
    @Autowired
    Grade_Repository grade_repository;
    public List<Grade> getAllGrades() {

        return grade_repository.findAll();
    }
    public Grade getGradeById(Integer id) {

        return grade_repository.findById(id).get();
    }
}
