package com.wangyi.spring_boot_ssm.demo.controller;

import com.wangyi.spring_boot_ssm.demo.pojo.User;
import com.wangyi.spring_boot_ssm.demo.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author Wrysunny
 * @Date 2020/1/412:50
 * @Version 1.0
 **/
@RestController
public class TestController {
    @Autowired
    private TestService testService;
    /*
     * @Author Wrysunny
     * @Description //TODO 注解配置的方法
     * @Date 13:18 2020/1/4
     * @Param []
     * @return java.util.List<com.wangyi.spring_boot_ssm.demo.pojo.User>
     **/
    @RequestMapping("/selectbyA")
    public List<User> sel(){
        return testService.selAllUserByAnnotation();
    }
    /*
     * @Author Wrysunny
     * @Description //TODO xml文件配置的方法
     * @Date 13:18 2020/1/4
     * @Param []
     * @return java.util.List<com.wangyi.spring_boot_ssm.demo.pojo.User>
     **/
    @RequestMapping("/selectbyB")
    public List<User> selB(){
        return testService.selAllUserByXML();
    }
}
