package com.java6.springtopic.config;

import com.java6.springtopic.MyThirdClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean(name = "componentConfig1")
    public ComponentConfig componentConfig(){
        return new ComponentConfig("K1","K2", "K3");
    }


}
