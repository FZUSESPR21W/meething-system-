package team.concerto.forum.mapper;

import team.concerto.forum.entity.User;

import java.util.List;

public interface ListDao
{
    List<User> getUserList(int fid);
}
