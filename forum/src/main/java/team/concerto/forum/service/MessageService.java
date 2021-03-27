package team.concerto.forum.service;

import com.baomidou.mybatisplus.extension.service.IService;
import team.concerto.forum.entity.Message;

import java.util.List;

public interface MessageService extends IService<Message> {

    List<Message> getMessages(int fid);
    void PostMessage(Message message);
}
