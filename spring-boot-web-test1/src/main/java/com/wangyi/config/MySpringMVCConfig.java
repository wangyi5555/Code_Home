package com.wangyi.config;


import com.wangyi.compoment.LoginHandlerInterceptor;
import com.wangyi.compoment.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
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
        registry.addViewController("/main").setViewName("login/success");
        registry.addViewController("/index").setViewName("index");
//        registry.addViewController("/").setViewName("register");
    }

    /*
    * 添加拦截器*/
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/","/index","/check","/asserts/**");
    }

    @Bean
    public LocaleResolver localeResolver() { //注意名字相同，否则不生效 @Autowried
        return new MyLocaleResolver();
    }
}
