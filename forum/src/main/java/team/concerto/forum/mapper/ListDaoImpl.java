package team.concerto.forum.mapper;


import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import team.concerto.forum.entity.User;
import team.concerto.forum.entity.User_Forum;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ListDaoImpl implements ListDao
{
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<User> getUserList(int fid)
    {
        List<User_Forum> list = jdbcTemplate.query("select * from userforum where fid = ?",
                new Object[]{fid},new BeanPropertyRowMapper<>(User_Forum.class));
        List<User> users = new ArrayList<>();
        for (User_Forum user :
                list)   {
            List<User> temp = jdbcTemplate.query("select * from user where uid = ?",
                    new Object[]{user.getUid()},new BeanPropertyRowMapper<>(User.class));
            if(temp.size() ==  1)
            users.add(temp.get(0));
        }
        return users;
    }
}
