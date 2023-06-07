package com.Online_Education_Platform.Online_Education_Platform.Controllers;

import com.Online_Education_Platform.Online_Education_Platform.Models.Assignment;
import com.Online_Education_Platform.Online_Education_Platform.Services.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "assignment")
public class AssignmentController {
    //    http://localhost:8080/assignment/getAll
    @Autowired
    AssignmentService assignmentService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Assignment> getAllAssignments() {

        return assignmentService.getAllAssignments();
    }
    @GetMapping(value = "getById")
    public Assignment getAssignmentById(@RequestParam Integer id) {

        return assignmentService.getAssignmentById(id);
    }
}
