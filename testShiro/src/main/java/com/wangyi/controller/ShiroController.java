package com.wangyi.controller;

import com.wangyi.services.TestService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("shiro")
public class ShiroController {

    @Autowired
    private TestService testService;

    @RequestMapping("login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password){
        Subject subject = SecurityUtils.getSubject();
        System.out.println(username+"     "+password);

        if(!subject.isAuthenticated()){
            UsernamePasswordToken token = new UsernamePasswordToken(username,password);
            token.setRememberMe(true);
            try {
                subject.login(token);
            } catch (AuthenticationException e){
                System.out.println("fail"+e.getMessage());
            }
        }

        return "redirect:/loginsuccess/success";
    }

    @RequestMapping("test")
    @RequiresRoles({"admin"})
    public String test(){
        testService.TestDate();
        return "redirect:/loginsuccess/success";
    }
}
