package com.ljx.testredis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    public String hello(@RequestParam(name = "name") String name , @RequestParam("msg") String message) {
        return String.format("hello %s , %s",name,message);
    }
}
