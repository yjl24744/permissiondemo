package com.starter.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloServiceProperties.class)
@ConditionalOnClass(HelloServiceConfiguration.class)
public class HelloServiceAutoConfiguration {

    @Autowired
    private HelloServiceProperties helloServiceProperties;

    @Bean
    @ConditionalOnMissingBean(HelloServiceConfiguration.class)
    public HelloServiceConfiguration helloServiceConfiguration() {
        HelloServiceConfiguration helloService = new HelloServiceConfiguration();
        helloService.setHelloServiceProperties(helloServiceProperties);
        return helloService;
    }
}
