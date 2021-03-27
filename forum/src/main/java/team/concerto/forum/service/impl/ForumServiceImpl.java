package team.concerto.forum.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import team.concerto.forum.entity.Forum;
import team.concerto.forum.mapper.ForumMapper;
import team.concerto.forum.service.ForumService;

@Service
public class ForumServiceImpl extends ServiceImpl<ForumMapper, Forum> implements ForumService {

}
