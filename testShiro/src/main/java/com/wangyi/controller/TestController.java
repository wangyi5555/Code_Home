package com.wangyi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("loginsuccess")
public class TestController {
    @RequestMapping("success")
    public String test1(){
        return "/login/success";
    }
    @RequestMapping("user")
    public String test2(){
        return "/login/user/user";
    }
    @RequestMapping("admin")
    public String test3(){
        return "/login/admin/admin";
    }
}
