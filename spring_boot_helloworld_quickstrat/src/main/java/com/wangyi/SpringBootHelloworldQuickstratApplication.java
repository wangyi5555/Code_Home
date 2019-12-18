package com.wangyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
//加载spring配置文件
//@ImportResource({"classpath:spring-bean.xml","classpath:spring-test.xml"})
//spring boot启动器标识
@SpringBootApplication
public class SpringBootHelloworldQuickstratApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHelloworldQuickstratApplication.class, args);
    }

}
