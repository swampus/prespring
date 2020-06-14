package com.java6.springtopic.service;

import com.java6.springtopic.config.ComponentConfig;

public class PhotoRecognitionService {
    private String authKey;
    private int processId;
    private String strDecorator;
    private ComponentConfig componentConfig;

    public PhotoRecognitionService(String authKey,
                                   int processId,
                                   String strDecorator,
                                   ComponentConfig componentConfig) {
        this.authKey = authKey;
        this.processId = processId;
        this.strDecorator = strDecorator;
        this.componentConfig = componentConfig;
    }

    public void doJob() {
        System.out.println("JOB: " + strDecorator);
    }
}
