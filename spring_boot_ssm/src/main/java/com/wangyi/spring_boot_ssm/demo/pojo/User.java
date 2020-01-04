package com.wangyi.spring_boot_ssm.demo.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import javax.naming.Name;
import java.util.Date;

/**
 * @ClassName User
 * @Description TODO 表的实体类
 * @Author Wrysunny
 * @Date 2020/1/412:31
 * @Version 1.0
 **/
@Data
@Component
public class User {
    private int id;
    private String user_name;
    private String password;
    private String name;
    private int age;
    private int sex;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date created;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updated;
}
