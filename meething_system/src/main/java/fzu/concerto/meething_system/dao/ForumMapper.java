package fzu.concerto.meething_system.dao;

import fzu.concerto.meething_system.pojo.Forum;
import java.util.List;

public interface ForumMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Forum record);

    Forum selectByPrimaryKey(Integer fid);

    List<Forum> selectAll();

    int updateByPrimaryKey(Forum record);
}