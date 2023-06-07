package com.Online_Education_Platform.Online_Education_Platform.Services;

import com.Online_Education_Platform.Online_Education_Platform.Models.Discussion;
import com.Online_Education_Platform.Online_Education_Platform.Repositories.DiscussionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class DiscussionService {
    @Autowired
    DiscussionRepository discussionRepository;
    public List<Discussion> getAllDiscussions() {

        return discussionRepository.findAll();
    }
    public Discussion getDiscussionById(Integer id) {

        return discussionRepository.findById(id).get();
    }
}
