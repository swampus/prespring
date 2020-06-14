package com.java6.springtopic;

import com.java6.springtopic.config.ComponentConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyThirdClass {

    @Autowired
    private ComponentConfig componentConfig;

    public void doJob() {
        System.out.println("HELLO ANNOTATION SPRING: " + componentConfig);
    }
}
