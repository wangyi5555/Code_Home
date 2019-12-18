package com.wangyi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
    @RequestMapping("/success")
    public String success(Model model) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<10;i++){
            list.add(i);
        }
        model.addAttribute("list", list);
        return "login/success";
    }
}
