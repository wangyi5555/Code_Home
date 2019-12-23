package com.wangyi.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("create servlet");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("destroy servlet");
    }
}
