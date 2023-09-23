package com.zzzyyo.lightnovel.controller;

import com.zzzyyo.lightnovel.entity.User;
import com.zzzyyo.lightnovel.service.UserService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class UserController {



    @Autowired
    private UserService userService;


    @GetMapping("/login")
    public String loginUser(User user) {

        return "";
    }

    @GetMapping("/findUser")
    public String findUser(@RequestParam("username") String username, @RequestParam("password") String password) {

        return "";
    }


    /**
     * 登录方法
     * @param user
     * @return
     */
    @PostMapping("/user/login")
    public String login(User user) {

        User login = userService.login(user);

        // 日志
        log.info("================================");
        log.info("login()方法获取到的user ====" + user);
        log.info("userService.login(user) 返回值login：" + login);
        log.info("================================");

        if (!login.getUsername().isEmpty()) {
            return "forword:/user/index";
        }
        return "redirect:/user/login";

    }

    /**
     * 注册用户
     * @param user
     * @return
     */
    @PostMapping("/user/add")
    public String addUser(User user) {
        int i = userService.addUser(user);

        // 日志
        log.info("================================");
        log.info("login()方法获取到的user ====" + user);
        log.info("userService.addUser(user) 返回值i：" + i);
        log.info("================================");

        if (i != 0) {
            return "forword:/user/index";
        }
        return "redirect:/user/add";
    }

}
