package team.concerto.forum.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.concerto.forum.entity.User;
import team.concerto.forum.mapper.ListDaoImpl;
import team.concerto.forum.service.ListService;

import java.util.List;

@Service
public class ListServiceImpl implements ListService {
    @Autowired
    private ListDaoImpl listdaoImpl;
    public List<User> getUserList(int fid)
    {
        return listdaoImpl.getUserList(fid);
    }
}
