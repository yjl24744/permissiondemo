package com.first.demo.vo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "person")
@Setter
@Getter
public class Person {
    private String name;
    private String gender;
    private String age;
}
