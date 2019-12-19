package com.wangyi.controller;


import com.wangyi.common.LogUtils;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;


@Controller
public class HelloController {
    @PostMapping("/check")
    public String success(@RequestParam("username") String username,
                          @RequestParam("password") String password,
                          HttpSession session) {
        LogUtils.getLogger().info(username+"------"+password);
        if (!StringUtils.isEmpty(username) && password.equals("12345")) {
            session.setAttribute("username", username);
            session.setAttribute("password", password);
            return "redirect:/main";
        }else {
            return "redirect:/index";
        }
    }
}
