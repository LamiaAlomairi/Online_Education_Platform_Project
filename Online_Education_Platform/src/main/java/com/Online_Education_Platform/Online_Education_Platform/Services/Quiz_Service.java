package com.Online_Education_Platform.Online_Education_Platform.Services;

import com.Online_Education_Platform.Online_Education_Platform.Models.Quiz;
import com.Online_Education_Platform.Online_Education_Platform.Repositories.Quiz_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class Quiz_Service {
    @Autowired
    Quiz_Repository quiz_repository;
    public List<Quiz> getAllQuizzes() {

        return quiz_repository.findAll();
    }
    public Quiz getQuizById(Integer id) {

        return quiz_repository.findById(id).get();
    }
}
