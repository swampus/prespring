package com.java6.springtopic.service;

import com.java6.springtopic.config.ComponentConfig;

public class PhotoRecognitionService {
    private String authKey;
    private int processId;
    private String strDecorator;
    private ComponentConfig componentConfig;

    public PhotoRecognitionService() {
    }

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
        System.out.println("JOB: " + strDecorator + " " + componentConfig);
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public int getProcessId() {
        return processId;
    }

    public void setProcessId(int processId) {
        this.processId = processId;
    }

    public String getStrDecorator() {
        return strDecorator;
    }

    public void setStrDecorator(String strDecorator) {
        this.strDecorator = strDecorator;
    }

    public ComponentConfig getComponentConfig() {
        return componentConfig;
    }

    public void setComponentConfig(ComponentConfig componentConfig) {
        this.componentConfig = componentConfig;
    }
}
