package com.Online_Education_Platform.Online_Education_Platform.Controllers;

import com.Online_Education_Platform.Online_Education_Platform.Models.Grade;
import com.Online_Education_Platform.Online_Education_Platform.Services.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "grade")
public class GradeController {
    //    http://localhost:8080/grade/getAll
    @Autowired
    GradeService gradeService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Grade> getAllGrades() {

        return gradeService.getAllGrades();
    }
    @GetMapping(value = "getById")
    public Grade getGradeById(@RequestParam Integer id) {

        return gradeService.getGradeById(id);
    }
}
