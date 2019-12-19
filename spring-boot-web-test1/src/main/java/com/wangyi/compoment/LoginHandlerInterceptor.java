package com.wangyi.compoment;

import com.wangyi.common.LogUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
* 自定义登录拦截器*/
public class LoginHandlerInterceptor implements HandlerInterceptor {
    /*
    * 目标方法执行前*/
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        LogUtils.getLogger().info("进入了登录拦截器");
        LogUtils.getLogger().info(request.getContextPath());
        Object username = request.getSession().getAttribute("username");
        if (username == null) {
            request.getRequestDispatcher("/").forward(request, response);
            return false;
        } else {
            return true;
        }
    }
    /*
    * 请求处理完成之后*/
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    /*
    * 请求完全完成之后*/
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
