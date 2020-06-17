package com.first.demo.rest;

import com.starter.demo.config.HelloServiceConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

    Logger log = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private HelloServiceConfiguration helloServiceConfiguration;

    @RequestMapping("/hello")
    public String hello() {
        log.info("hello2");
        return "hello";
    }

    @RequestMapping("/starter")
    public String starter() {
        String info = "姓名：" + helloServiceConfiguration.getHelloServiceProperties().getName()
                + "年龄：" + helloServiceConfiguration.getHelloServiceProperties().getSex();
        log.info(info);
        return info;
    }
}
