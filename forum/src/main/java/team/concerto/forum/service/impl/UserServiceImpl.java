package team.concerto.forum.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import team.concerto.forum.entity.User;
import team.concerto.forum.mapper.UserMapper;
import team.concerto.forum.service.UserService;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public int register(User user) {
        if(this.getOne((Wrappers.<User>lambdaQuery().eq(User::getName, user.getName())))!=null)
            return 1;
        this.save(user);
        return 0;
    }
}
