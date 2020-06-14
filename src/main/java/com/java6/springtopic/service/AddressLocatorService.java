package com.java6.springtopic.service;

import com.java6.springtopic.config.ComponentConfig;

public class AddressLocatorService {
    private String dbUrl;
    private String country;
    private ComponentConfig componentConfig;

    public AddressLocatorService(String dbUrl,
                                 String country,
                                 ComponentConfig componentConfig) {
        this.dbUrl = dbUrl;
        this.country = country;
        this.componentConfig = componentConfig;
    }

    public void doJob() {
        System.out.println("AddressLocatorDoJob");
    }
}
