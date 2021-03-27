package team.concerto.forum.controller;

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
    public Map<String,Object> login(@RequestBody User user) {
        long res = userService.login(user);
        Map<String,Object> modelMap = new HashMap<>();
        if(res==-1){
            modelMap.put("code",1);
        }else  if(res == -2){
            modelMap.put("code",2);
        }else{
            modelMap.put("code",0);
            modelMap.put("id",res);
        }
        return modelMap;
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

    @GetMapping("/test")
    public Object test(){
        return userService.list();
    }

}
