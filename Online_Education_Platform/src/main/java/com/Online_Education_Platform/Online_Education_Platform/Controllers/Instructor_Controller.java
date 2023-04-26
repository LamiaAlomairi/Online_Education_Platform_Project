package com.Online_Education_Platform.Online_Education_Platform.Controllers;

import com.Online_Education_Platform.Online_Education_Platform.Models.Instructor;
import com.Online_Education_Platform.Online_Education_Platform.Services.Instructor_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "instructor")
public class Instructor_Controller {
    //    http://localhost:8080/instructor/getAll
    @Autowired
    Instructor_Service instructor_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Instructor> getAllInstructors() {

        return instructor_service.getAllInstructors();
    }
    @GetMapping(value = "getById")
    public Instructor getInstructorById(@RequestParam Integer id) {

        return instructor_service.getInstructorById(id);
    }
}
