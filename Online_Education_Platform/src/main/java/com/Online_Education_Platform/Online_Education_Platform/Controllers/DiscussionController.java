package com.Online_Education_Platform.Online_Education_Platform.Controllers;

import com.Online_Education_Platform.Online_Education_Platform.Models.Discussion;
import com.Online_Education_Platform.Online_Education_Platform.Services.DiscussionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "discussion")
public class DiscussionController {
    //    http://localhost:8080/discussion/getAll
    @Autowired
    DiscussionService discussionService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Discussion> getAllDiscussions() {

        return discussionService.getAllDiscussions();
    }
    @GetMapping(value = "getById")
    public Discussion getDiscussionById(@RequestParam Integer id) {

        return discussionService.getDiscussionById(id);
    }
}
