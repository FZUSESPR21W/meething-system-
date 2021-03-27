package team.concerto.forum.service;


import team.concerto.forum.entity.User;

import java.util.List;

public interface ListService
{
    List<User> getUserList(int fid);
}
