package com.java6.springtopic.processor;

import com.java6.springtopic.config.ComponentConfig;
import com.java6.springtopic.service.AddressLocatorService;
import com.java6.springtopic.service.PhotoRecognitionService;

public class UserProcessor {
    private ComponentConfig componentConfig1 = new ComponentConfig("K1","K2","K3");
    private ComponentConfig componentConfig2 = new ComponentConfig("K11","K22","K33");

    private AddressLocatorService addressLocatorService
            = new AddressLocatorService("asd","lva", componentConfig1);
    private PhotoRecognitionService photoRecognitionService
            = new PhotoRecognitionService(
                    "Key1", 11, "decorator", componentConfig2);

    public void doJob(){
        addressLocatorService.doJob();
        photoRecognitionService.doJob();
    }

}
