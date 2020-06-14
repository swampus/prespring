package com.java6.springtopic.service;

import com.java6.springtopic.config.ComponentConfig;

public class AddressLocatorService {
    private String dbUrl;
    private String country;
    private ComponentConfig componentConfig;

    public AddressLocatorService() {
    }

    public AddressLocatorService(String dbUrl,
                                 String country,
                                 ComponentConfig componentConfig) {
        this.dbUrl = dbUrl;
        this.country = country;
        this.componentConfig = componentConfig;
    }

    public void doJob() {
        System.out.println("AddressLocatorDoJob: " + componentConfig);
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ComponentConfig getComponentConfig() {
        return componentConfig;
    }

    public void setComponentConfig(ComponentConfig componentConfig) {
        this.componentConfig = componentConfig;
    }
}
