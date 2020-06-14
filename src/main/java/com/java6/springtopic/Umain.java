package com.java6.springtopic;

import com.java6.springtopic.processor.SecurityProcessor;
import com.java6.springtopic.processor.UserProcessor;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Umain {

    @Autowired
    private MyThirdClass myThirdClass;

    public static void main(String args[]){
        ApplicationContext context
                = new ClassPathXmlApplicationContext("beans.xml");

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext("com.java6.springtopic"); // Use annotated beans from the specified package

        Umain main = ctx.getBean(Umain.class);
        main.myThirdClass.doJob();
    }


}
