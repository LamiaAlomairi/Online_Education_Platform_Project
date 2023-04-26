package com.Online_Education_Platform.Online_Education_Platform.Controllers;

import com.Online_Education_Platform.Online_Education_Platform.Models.Grade;
import com.Online_Education_Platform.Online_Education_Platform.Services.Grade_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "grade")
public class Grade_Controller {
    //    http://localhost:8080/grade/getAll
    @Autowired
    Grade_Service grade_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Grade> getAllGrades() {

        return grade_service.getAllGrades();
    }
    @GetMapping(value = "getById")
    public Grade getGradeById(@RequestParam Integer id) {

        return grade_service.getGradeById(id);
    }
}
