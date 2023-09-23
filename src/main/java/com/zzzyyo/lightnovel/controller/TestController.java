package com.zzzyyo.lightnovel.controller;

import com.zzzyyo.lightnovel.entity.User;
import com.zzzyyo.lightnovel.mapper.UserMapper;
import com.zzzyyo.lightnovel.service.UserService;
import com.zzzyyo.lightnovel.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {

    // @ResponseBody 将java对象转为json格式的数据。
    // @RequestBody 接受的是一个json格式的字符串
    //@GetMapping("/test")

}
