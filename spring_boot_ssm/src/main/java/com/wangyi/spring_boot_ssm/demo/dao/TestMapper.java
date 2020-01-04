package com.wangyi.spring_boot_ssm.demo.dao;

import com.wangyi.spring_boot_ssm.demo.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName TestMapper
 * @Description TODO
 * @Author Wrysunny
 * @Date 2020/1/412:36
 * @Version 1.0
 **/

public interface TestMapper {
    @Select("select * from tb_user")
    List<User> selAllByAnnotation();

    List<User> selAllByXML();
}
