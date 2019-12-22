package com.wangyi.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
* 自定义扩展SpringMVC配置*/
@Configuration
public class MySpringMVCConfig implements WebMvcConfigurer {

    /*
    * 添加路径*/
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/board").setViewName("login/board");
    }



}
