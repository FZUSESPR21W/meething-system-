package fzu.concerto.meething_system.dao;

import fzu.concerto.meething_system.pojo.Forum;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ForumMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Forum record);

    Forum selectByPrimaryKey(Integer fid);

    List<Forum> selectAll();

    int updateByPrimaryKey(Forum record);
}