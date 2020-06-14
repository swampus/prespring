package com.java6.springtopic.processor;

import com.java6.springtopic.service.AddressLocatorService;
import com.java6.springtopic.service.PhotoRecognitionService;

public class UserProcessor {
    private AddressLocatorService addressLocatorService
            = new AddressLocatorService("asd","lva");
    private PhotoRecognitionService photoRecognitionService
            = new PhotoRecognitionService(
                    "Key1", 11, "decorator");

    public void doJob(){
        addressLocatorService.doJob();
        photoRecognitionService.doJob();
    }

}
