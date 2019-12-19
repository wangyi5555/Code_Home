package com.wangyi.compoment;




import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/*
* 自定义区域信息解析器
* */

public class MyLocaleResolver implements LocaleResolver {
    /*
    * 解析请求中携带的区域信息参数*/

    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        //获取自定义请求头信息，l的参数值
        String l=httpServletRequest.getParameter("l");
        //获取系统的默认区域信息
        Locale locale=Locale.getDefault();
        if (!StringUtils.isEmpty(l)){
            String[] split=l.split("_");
            //接收的第一个参数为：语言代码，国家代码
            locale=new Locale(split[0],split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {
    }


}
