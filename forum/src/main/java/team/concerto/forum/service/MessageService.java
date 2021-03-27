package team.concerto.forum.service;

import team.concerto.forum.entity.Message;

import java.util.List;

public interface MessageService {
    public List<Message> getMessages(int fid);
    public void PostMessage(Message message);
}
