package fzu.concerto.meething_system.controller;

import fzu.concerto.meething_system.pojo.User;
import fzu.concerto.meething_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody User user) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int result = userService.login(user);
        if (result == 1) {
            modelMap.put("code", 1);
            modelMap.put("message", "登录成功");
            modelMap.put("charactor", user.getCharacter());
        } else if (result == 2) {
            modelMap.put("code", 2);
            modelMap.put("message", "用户不存在");
        } else if (result == 3) {
            modelMap.put("code", 3);
            modelMap.put("message", "邮箱或密码输入错误");
        }
        return modelMap;
    }

    @PostMapping("/register")
    private Map<String, Object> register(@RequestBody User user) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int result = userService.insertUser(user);
        if (result == 1) {
            modelMap.put("code", 1);
            modelMap.put("message", "注册成功");
        } else if (result == 2) {
            modelMap.put("code", 2);
            modelMap.put("message", "用户已经存在");
        }
        return modelMap;
    }
}