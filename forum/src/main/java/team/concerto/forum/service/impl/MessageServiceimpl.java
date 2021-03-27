package team.concerto.forum.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.catalina.mapper.Mapper;
import org.springframework.stereotype.Service;
import team.concerto.forum.entity.Message;
import team.concerto.forum.mapper.MessageMapper;
import team.concerto.forum.service.MessageService;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MessageServiceimpl extends ServiceImpl<MessageMapper,Message> implements MessageService {

    @Resource
    MessageMapper messageMapper;

    @Override
    public List<Message> getMessages(int fid) {
        LambdaQueryWrapper<Message> lambdaQ = Wrappers.lambdaQuery();
        lambdaQ.eq(Message::getFid, fid);
        return messageMapper.selectList(lambdaQ);
    }

    @Override
    public void PostMessage(Message message) {
        messageMapper.insert(message);
    }
}
