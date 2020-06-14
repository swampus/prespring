package com.java6.springtopic.config;

import com.java6.springtopic.service.AddressLocatorService;
import com.java6.springtopic.service.PhotoRecognitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean(name = "componentConfig1")
    public ComponentConfig componentConfig() {
        return new ComponentConfig("K1", "K2", "K3");
    }

    @Bean(name = "componentConfig2")
    public ComponentConfig componentConfig2() {
        return new ComponentConfig("K1-1", "K2-2", "K3-3");
    }

    @Bean
    public AddressLocatorService addressLocatorService(
                    @Autowired
                    @Qualifier("componentConfig1")
                            ComponentConfig componentConfig){
        AddressLocatorService addressLocatorService
                = new AddressLocatorService("http://somehing","LVA",
                componentConfig);
        return addressLocatorService;
    }

    @Bean
    public PhotoRecognitionService photoRecognitionService(
            @Autowired
            @Qualifier("componentConfig2")
                    ComponentConfig componentConfig){
        PhotoRecognitionService photoRecognitionService
                = new PhotoRecognitionService("secKey",11, "DECORATE",
                componentConfig);
        return photoRecognitionService;
    }


}
