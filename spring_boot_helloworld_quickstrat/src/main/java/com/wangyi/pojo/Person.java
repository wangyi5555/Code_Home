package com.wangyi.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@Component
@ConfigurationProperties("person")
@Validated
public class Person {
//    @Email
    private String name;
    private Integer age;
    private Boolean isBoss;
    private Date birth;
    private Map<String, Object> maps;
    private List<Object> lists;
    private Dog dog;

}
