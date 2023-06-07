package com.Online_Education_Platform.Online_Education_Platform.Controllers;

import com.Online_Education_Platform.Online_Education_Platform.Models.Instructor;
import com.Online_Education_Platform.Online_Education_Platform.Services.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "instructor")
public class InstructorController {
    //    http://localhost:8080/instructor/getAll
    @Autowired
    InstructorService instructorService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Instructor> getAllInstructors() {

        return instructorService.getAllInstructors();
    }
    @GetMapping(value = "getById")
    public Instructor getInstructorById(@RequestParam Integer id) {

        return instructorService.getInstructorById(id);
    }
}
