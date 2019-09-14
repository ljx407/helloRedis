package com.ljx.testredis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam(name = "name") String name , @RequestParam("msg") String message) {
        name = StringUtils.isEmpty(name) ? "ljx" : name;
        message = StringUtils.isEmpty(message) ? "hello world" : message;
        return String.format("hello %s , %s",name,message);
    }
}
