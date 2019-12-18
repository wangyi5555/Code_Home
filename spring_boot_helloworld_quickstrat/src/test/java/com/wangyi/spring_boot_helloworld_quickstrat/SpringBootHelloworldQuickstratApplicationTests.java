package com.wangyi.spring_boot_helloworld_quickstrat;

import com.wangyi.pojo.Person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringBootHelloworldQuickstratApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    Logger logger = LoggerFactory.getLogger(getClass());


    @Test
    void testService(){
        boolean b = ioc.containsBean("testServiceImpl");
        System.out.println(b);
        b = ioc.containsBean("testServiceImpl1");
        System.out.println(b);
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }

    @Test
    void testLog(){
        logger.trace("trace 日志");
        logger.debug("debug 日志");
//        默认输出日志级别
        logger.info("info 日志");
        logger.warn("warn 日志");
        logger.error("error 日志");
    }

}
