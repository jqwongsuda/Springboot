package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    //这两个注解，一个处理接收，一个处理发送
    @ResponseBody//让这个“Hello World！”能够写出去
    @RequestMapping("/hello")//接收来自浏览器的hello请求
    public String Hello(){
        return "Hello World!";
    }

    //入口
}
