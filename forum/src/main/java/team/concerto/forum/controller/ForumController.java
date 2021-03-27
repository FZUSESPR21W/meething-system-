package team.concerto.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import team.concerto.forum.entity.Forum;
import team.concerto.forum.service.ForumService;

import java.util.List;

@RestController
public class ForumController {
    private final ForumService forumService;

    @Autowired
    public ForumController(ForumService forumService) {
        this.forumService = forumService;
    }

    @GetMapping("/allForumInfo")
    public List<Forum> getAllForumInfo(){
        return forumService.list();
    }
}
