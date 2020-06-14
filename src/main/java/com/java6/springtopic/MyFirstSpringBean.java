package com.java6.springtopic;

import java.io.IOException;

public class MyFirstSpringBean {
    private String abcd;

    public String getAbcd() {
        return abcd;
    }

    public void setAbcd(String abcd) {
        this.abcd = abcd;
    }

    public void drukat(){
        System.out.println(abcd);
    }
}
