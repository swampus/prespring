package com.java6.springtopic.processor;

import com.java6.springtopic.config.ComponentConfig;
import com.java6.springtopic.service.AddressLocatorService;
import com.java6.springtopic.service.PhotoRecognitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecurityProcessor {

    public SecurityProcessor() {
    }

    @Autowired
    private AddressLocatorService addressLocatorService;

    @Autowired
    private PhotoRecognitionService photoRecognitionService;

    public AddressLocatorService getAddressLocatorService() {
        return addressLocatorService;
    }

    public void setAddressLocatorService(AddressLocatorService addressLocatorService) {
        this.addressLocatorService = addressLocatorService;
    }

    public PhotoRecognitionService getPhotoRecognitionService() {
        return photoRecognitionService;
    }

    public void setPhotoRecognitionService(PhotoRecognitionService photoRecognitionService) {
        this.photoRecognitionService = photoRecognitionService;
    }

    public void doJob(){
        addressLocatorService.doJob();
        photoRecognitionService.doJob();
        photoRecognitionService.doJob();
        photoRecognitionService.doJob();
    }
}
