package team.concerto.forum.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.concerto.forum.entity.Forum;
import team.concerto.forum.entity.Message;
import team.concerto.forum.service.MessageService;
import team.concerto.forum.service.impl.MessageServiceimpl;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
public class MessageController {
    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @Resource
    MessageServiceimpl messageServiceimpl;


    @GetMapping("/Message")
    public List<Message> getList(@RequestParam int fid) {
        return messageServiceimpl.getMessages(fid);
    }

    @PostMapping("/Message")
    public void getList(@RequestBody Message message) {
        messageServiceimpl.PostMessage(message);

    }

    @PostMapping("/addMessage")
    public boolean addMessage(@RequestBody Message message) {
        System.out.println(message.toString());
        SimpleDateFormat tempDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String datetime = tempDate.format(new java.util.Date());
        message.setTime(datetime);
        return messageService.save(message);
    }

    @PostMapping("/forumMessage")
    public List<Message> forumMessage(@RequestBody Forum forum) {
        return messageService.list(Wrappers.<Message>lambdaQuery().eq(Message::getFid, forum.getFid()));
    }
}
