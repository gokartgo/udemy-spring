package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);  // retrieve bean from spring container
        Coach alphaCoach = context.getBean("myCoach", Coach.class);
        // call methods on the bean
        System.out.println((theCoach == alphaCoach) + "");

        System.out.println("Memory location for theCoach" + theCoach);

        System.out.println("Memory location for alphaCoach" + alphaCoach);
        // close the context
        context.close();
    }
}
