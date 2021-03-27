package team.concerto.forum.controller;

import org.springframework.web.bind.annotation.*;
import team.concerto.forum.entity.Message;
import team.concerto.forum.entity.User;
import team.concerto.forum.service.impl.MessageServiceimpl;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
public class MessageController {
    @Resource
    MessageServiceimpl messageServiceimpl;
    @GetMapping ("/Message")
    public List<Message> getList(@RequestParam int fid)
    {
        return messageServiceimpl.getMessages(fid);
    }

    @PostMapping ("/Message")
    public void getList(@RequestBody Message message)
    {
         messageServiceimpl.PostMessage(message);

    }
}
