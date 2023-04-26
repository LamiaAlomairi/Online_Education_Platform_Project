package com.Online_Education_Platform.Online_Education_Platform.Services;

import com.Online_Education_Platform.Online_Education_Platform.Models.Discussion;
import com.Online_Education_Platform.Online_Education_Platform.Repositories.Discussion_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class Discussion_Service {
    @Autowired
    Discussion_Repository discussion_repository;
    public List<Discussion> getAllDiscussions() {

        return discussion_repository.findAll();
    }
    public Discussion getDiscussionById(Integer id) {

        return discussion_repository.findById(id).get();
    }
}
