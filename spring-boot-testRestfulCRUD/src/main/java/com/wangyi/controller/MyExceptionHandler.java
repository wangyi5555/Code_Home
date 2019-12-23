package com.wangyi.controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(NullPointerException.class)
    public String handleException(Exception e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
//        自适应处理：设置状态码并转发到/error
        request.setAttribute("javax.servlet.error.status_code", 500);
        map.put("code", "user no exist");
        map.put("message", e.getMessage());
        return "forward:/error";
    }

}
