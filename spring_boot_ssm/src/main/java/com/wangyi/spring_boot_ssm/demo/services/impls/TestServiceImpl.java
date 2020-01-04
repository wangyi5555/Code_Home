package com.wangyi.spring_boot_ssm.demo.services.impls;

import com.wangyi.spring_boot_ssm.demo.dao.TestMapper;
import com.wangyi.spring_boot_ssm.demo.pojo.User;
import com.wangyi.spring_boot_ssm.demo.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName TestServiceImpl
 * @Description TODO
 * @Author Wrysunny
 * @Date 2020/1/412:48
 * @Version 1.0
 **/
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    @Override
    public List<User> selAllUserByAnnotation() {
        return testMapper.selAllByAnnotation();
    }

    @Override
    public List<User> selAllUserByXML() {
        return testMapper.selAllByXML();
    }
}
