package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
        GolfCoach theGolfCoach = context.getBean("myGolfCoach", GolfCoach.class);

        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getEmailAddress());

        System.out.println(theCoach.getTeam());

        System.out.println(theGolfCoach.getDailyFortune());
        System.out.println(theGolfCoach.getDailyFortune());
        System.out.println(theGolfCoach.getDailyFortune());

        context.close();
    }
}
