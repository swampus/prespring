package com.java6.springtopic.processor;

import com.java6.springtopic.config.ComponentConfig;
import com.java6.springtopic.service.AddressLocatorService;
import com.java6.springtopic.service.PhotoRecognitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserProcessor {

    private AddressLocatorService addressLocatorService;
    private PhotoRecognitionService photoRecognitionService;


    public UserProcessor() {
    }

    @Autowired
    public UserProcessor( AddressLocatorService addressLocatorService,
                         PhotoRecognitionService photoRecognitionService) {
        this.addressLocatorService = addressLocatorService;
        this.photoRecognitionService = photoRecognitionService;
    }

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
    }

}
