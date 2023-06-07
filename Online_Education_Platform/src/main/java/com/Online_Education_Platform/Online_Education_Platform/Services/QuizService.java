package com.Online_Education_Platform.Online_Education_Platform.Services;

import com.Online_Education_Platform.Online_Education_Platform.Models.Quiz;
import com.Online_Education_Platform.Online_Education_Platform.Repositories.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class QuizService {
    @Autowired
    QuizRepository quizRepository;
    public List<Quiz> getAllQuizzes() {

        return quizRepository.findAll();
    }
    public Quiz getQuizById(Integer id) {

        return quizRepository.findById(id).get();
    }
}
