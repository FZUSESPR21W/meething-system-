package team.concerto.forum.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import team.concerto.forum.entity.User;
import team.concerto.forum.entity.Userforum;
import team.concerto.forum.service.ForumService;
import team.concerto.forum.service.UserService;
import team.concerto.forum.service.UserforumService;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    private final UserService userService;
    private final UserforumService userforumService;

    @Autowired
    public UserController(UserService userService,  UserforumService userforumService){
        this.userService=userService;
        this.userforumService = userforumService;
    }


    @PostMapping("/login")
    public JSONObject login(@RequestBody User user) {
        JSONObject jo = new JSONObject();
        User qUser = userService.getOne(Wrappers.<User>lambdaQuery().eq(User::getName, user.getName()));

        if (qUser == null)
            jo.put("code",1);
        else if (!user.getPassword().equals(qUser.getPassword()))
            jo.put("code",2);
        else {
            jo.put("code", 0);
            jo.put("user", qUser);
        }
        return jo;
    }

    @PostMapping("/register")
    public Map<String,Object> register(@RequestBody User user){
        Map<String,Object> modelMap = new HashMap<>();
        int res = userService.register(user);

        modelMap.put("code",res);
        return  modelMap;
    }

    @PostMapping("/myforum")
    public Map<String,Object> myforum(@RequestBody User user){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("forum",userforumService.list(Wrappers.<Userforum>lambdaQuery().eq(Userforum::getUid, user.getUid())));
        return modelMap;
    }

    @GetMapping("/allUsers")
    public Object getAllUsers(){
        return userService.list();
    }

    @PostMapping("/joinForum")
    public void joinForum(@RequestBody JSONObject jsonParam){
        long uid = jsonParam.getLong("uid");
        JSONArray ja = jsonParam.getJSONArray("fid");
        for(int i =0;i<ja.size();i++){
            Userforum uf = new Userforum();
            uf.setUid(uid);
            uf.setFid(ja.getLong(i));
            userforumService.save(uf);
        }

    }

}
