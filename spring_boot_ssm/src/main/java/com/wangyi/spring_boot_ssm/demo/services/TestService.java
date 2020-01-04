package com.wangyi.spring_boot_ssm.demo.services;
import com.wangyi.spring_boot_ssm.demo.pojo.User;

import	java.util.List;

/**
 * @ClassName TestService
 * @Description TODO
 * @Author Wrysunny
 * @Date 2020/1/412:48
 * @Version 1.0
 **/
public interface TestService {
    List<User> selAllUserByAnnotation();
    List<User> selAllUserByXML();
}
