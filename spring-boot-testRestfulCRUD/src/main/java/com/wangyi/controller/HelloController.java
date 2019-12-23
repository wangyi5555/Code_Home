package com.wangyi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/hello/{id}")
    @ResponseBody
    public String hello(@PathVariable("id")int id){
        if(id==1){
            throw new NullPointerException();
        }
        return "hello world";
    }
}
