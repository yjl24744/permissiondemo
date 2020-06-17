package com.starter.demo.config;

public class HelloServiceConfiguration {

    private HelloServiceProperties helloServiceProperties;

    public void setHelloServiceProperties(HelloServiceProperties helloServiceProperties) {
        this.helloServiceProperties = helloServiceProperties;
    }

    public HelloServiceProperties getHelloServiceProperties() {
        return helloServiceProperties;
    }
}
