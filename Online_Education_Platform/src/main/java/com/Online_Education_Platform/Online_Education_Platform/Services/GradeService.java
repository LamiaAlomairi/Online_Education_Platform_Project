package com.Online_Education_Platform.Online_Education_Platform.Services;

import com.Online_Education_Platform.Online_Education_Platform.Models.Grade;
import com.Online_Education_Platform.Online_Education_Platform.Repositories.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class GradeService {
    @Autowired
    GradeRepository gradeRepository;
    public List<Grade> getAllGrades() {

        return gradeRepository.findAll();
    }
    public Grade getGradeById(Integer id) {

        return gradeRepository.findById(id).get();
    }
}
