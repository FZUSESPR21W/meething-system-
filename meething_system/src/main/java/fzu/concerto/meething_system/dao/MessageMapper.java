package fzu.concerto.meething_system.dao;

import fzu.concerto.meething_system.pojo.Message;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Message record);

    Message selectByPrimaryKey(Integer mid);

    List<Message> selectAll();

    int updateByPrimaryKey(Message record);
}