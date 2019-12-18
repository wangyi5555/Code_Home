package com.wangyi.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class Test1Controller {
    @RequestMapping("login")
    public String login(){
        return "login";
    }
    @RequestMapping("unauthorized")
    public String unauthorized(){
        return "unauthorized";
    }
    @RequestMapping("register")
    public String register(){
        return "register";
    }

    @RequestMapping("uploadpage")
    public String toupload(){
        return "upload";
    }
    @RequestMapping("upload")
    public String upload(MultipartFile file, String name) throws IOException {
        String fileName = file.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        String uuid = UUID.randomUUID().toString();
        FileUtils.copyInputStreamToFile(file.getInputStream(), new File("H:/" + uuid + suffix));
        return "upload";
    }
}
