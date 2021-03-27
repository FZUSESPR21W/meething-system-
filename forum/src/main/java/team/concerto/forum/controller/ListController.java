package team.concerto.forum.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.concerto.forum.entity.User;
import team.concerto.forum.service.ListService;
import team.concerto.forum.service.UserService;

import java.util.HashMap;

@RestController
public class ListController
{
    @Autowired
    private ListService listService;
    @GetMapping("/userList")
    public HashMap<String,Object> getUserList(@RequestParam int fid)
    {
        java.util.List<User> list= listService.getUserList(fid);
        HashMap<String,Object> map = new HashMap<>();
        map.put("code",200);
        map.put("message","查询成功!");
        map.put("data",list);
        return map;
    }
}
