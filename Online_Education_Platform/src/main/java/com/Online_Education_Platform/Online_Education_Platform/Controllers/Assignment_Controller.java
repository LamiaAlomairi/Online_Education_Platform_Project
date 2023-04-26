package com.Online_Education_Platform.Online_Education_Platform.Controllers;

import com.Online_Education_Platform.Online_Education_Platform.Models.Assignment;
import com.Online_Education_Platform.Online_Education_Platform.Services.Assignment_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "assignment")
public class Assignment_Controller {
    //    http://localhost:8080/assignment/getAll
    @Autowired
    Assignment_Service assignment_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Assignment> getAllAssignments() {

        return assignment_service.getAllAssignments();
    }
    @GetMapping(value = "getById")
    public Assignment getAssignmentById(@RequestParam Integer id) {

        return assignment_service.getAssignmentById(id);
    }
}
