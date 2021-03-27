package team.concerto.forum.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import team.concerto.forum.entity.Userforum;
import team.concerto.forum.mapper.UserforumMapper;
import team.concerto.forum.service.UserforumService;

@Service
public class UserforumServiceImpl extends ServiceImpl<UserforumMapper, Userforum> implements UserforumService {
}
