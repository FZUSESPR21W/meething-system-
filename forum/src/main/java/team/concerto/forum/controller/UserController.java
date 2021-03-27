package team.concerto.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import team.concerto.forum.entity.User;
import team.concerto.forum.service.UserService;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
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

    @GetMapping("/test")
    public Object test(){
        return userService.list();
    }

}
