package team.concerto.forum.service;

import com.baomidou.mybatisplus.extension.service.IService;
import team.concerto.forum.entity.User;

public interface UserService extends IService<User> {
    long login(User user);
    int register(User user);
}
