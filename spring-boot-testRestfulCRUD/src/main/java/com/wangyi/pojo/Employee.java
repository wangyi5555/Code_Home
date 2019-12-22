package com.wangyi.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Employee {
    private Integer id = 0;
    private String name;
    private int sex;
    private Date birthday;
    private String department;

    public Employee(Integer id,String name, int sex, Date birthday, String department) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.department = department;
    }
}
