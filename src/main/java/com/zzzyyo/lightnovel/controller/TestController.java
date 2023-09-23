package com.zzzyyo.lightnovel.controller;

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
    @RequestMapping("/test")
    public List Test() {

        ArrayList<Object> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");

        System.out.println(list);
        return list;
    }


}
