package com.Online_Education_Platform.Online_Education_Platform.Controllers;

import com.Online_Education_Platform.Online_Education_Platform.Models.Discussion;
import com.Online_Education_Platform.Online_Education_Platform.Services.Discussion_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "discussion")
public class Discussion_Controller {
    //    http://localhost:8080/discussion/getAll
    @Autowired
    Discussion_Service discussion_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Discussion> getAllDiscussions() {

        return discussion_service.getAllDiscussions();
    }
    @GetMapping(value = "getById")
    public Discussion getDiscussionById(@RequestParam Integer id) {

        return discussion_service.getDiscussionById(id);
    }
}
