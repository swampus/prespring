package com.java6.springtopic;

import com.java6.springtopic.processor.SecurityProcessor;
import com.java6.springtopic.processor.UserProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Umain {
    public static void main(String args[]){
        UserProcessor userProcessor = new UserProcessor();
        userProcessor.doJob();

        SecurityProcessor securityProcessor = new SecurityProcessor();
        securityProcessor.doJob();

        ApplicationContext context
                = new ClassPathXmlApplicationContext("beans.xml");

        MyFirstSpringBean myFirstSpringBean
                = (MyFirstSpringBean) context.getBean("myFirstSpringBean");
        myFirstSpringBean.drukat();

    }
}
