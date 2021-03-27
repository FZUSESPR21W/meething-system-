package fzu.concerto.meething_system.dao;

import fzu.concerto.meething_system.pojo.UserForum;
import java.util.List;

public interface UserForumMapper {
    int deleteByPrimaryKey(Integer ufid);

    int insert(UserForum record);

    UserForum selectByPrimaryKey(Integer ufid);

    List<UserForum> selectAll();

    int updateByPrimaryKey(UserForum record);
}