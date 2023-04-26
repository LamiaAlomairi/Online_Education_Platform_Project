package com.Online_Education_Platform.Online_Education_Platform.Controllers;

import com.Online_Education_Platform.Online_Education_Platform.Models.Quiz;
import com.Online_Education_Platform.Online_Education_Platform.Services.Quiz_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "quiz")
public class Quiz_Controller {
    //    http://localhost:8080/quiz/getAll
    @Autowired
    Quiz_Service quiz_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Quiz> getAllQuizzes() {

        return quiz_service.getAllQuizzes();
    }
    @GetMapping(value = "getById")
    public Quiz getQuizById(@RequestParam Integer id) {

        return quiz_service.getQuizById(id);
    }
}
