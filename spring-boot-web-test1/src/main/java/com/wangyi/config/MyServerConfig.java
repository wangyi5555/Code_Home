package com.wangyi.config;

import com.wangyi.servlet.MyFliter;
import com.wangyi.servlet.MyListener;
import com.wangyi.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.servlet.Servlet;
import javax.servlet.ServletContextListener;
import java.util.Arrays;

/*
* 配置嵌入式的服务器*/
@Configuration
public class MyServerConfig {
    @Bean
    public ServletRegistrationBean<MyServlet> myServlet() {
        return new ServletRegistrationBean<>(new MyServlet(), "/test");
    }
    @Bean
    public FilterRegistrationBean<MyFliter> myFilter(){
        FilterRegistrationBean<MyFliter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new MyFliter());
        registrationBean.setUrlPatterns(Arrays.asList("/test"));
        return registrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean<MyListener> myListener() {
        return new ServletListenerRegistrationBean<>(new MyListener());
    }
}
