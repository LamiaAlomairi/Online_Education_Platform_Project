package com.Online_Education_Platform.Online_Education_Platform.Controllers;

import com.Online_Education_Platform.Online_Education_Platform.Models.Quiz;
import com.Online_Education_Platform.Online_Education_Platform.Services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "quiz")
public class QuizController {
    //    http://localhost:8080/quiz/getAll
    @Autowired
    QuizService quizService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Quiz> getAllQuizzes() {

        return quizService.getAllQuizzes();
    }
    @GetMapping(value = "getById")
    public Quiz getQuizById(@RequestParam Integer id) {

        return quizService.getQuizById(id);
    }
}
