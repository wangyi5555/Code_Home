package com.wangyi.controller;

import com.wangyi.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {


    @RequestMapping("/check")
    public String check(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session) {
        if (username != null && password.equals("12345")) {
            session.setAttribute("username", username);
            return "login/board";
        }else{
            return "index";
        }
    }
}
