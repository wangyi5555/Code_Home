package com.wangyi.services.impl;

import com.wangyi.services.TestService;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public void TestDate() {
        System.out.println(new Date());
    }
}
