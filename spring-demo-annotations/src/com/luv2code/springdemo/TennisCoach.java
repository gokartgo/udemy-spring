package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// set up bean id @Component("thatSillyCoach")
@Component //default is classname but first letter is lower case
//@Scope("prototype")
public class TennisCoach implements Coach {
    // use auto wired in dependency injection
    @Autowired
    @Qualifier("fileFortuneService") // qualifier use for select from multi dependency
    private FortuneService fortuneService;
    // define a default constructor
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    // define my init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
    }

    // define my destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> TennisCoach: inside of doMyCleanupStuff");
    }

    // use auto wired in constructor injection
//    private FortuneService fortuneService;
//
//    @Autowired
//    public TennisCoach(@Qualifier("RESTFortuneService") FortuneService fortuneService) {
//        System.out.println(">> TennisCoach: inside default constructor");
//        this.fortuneService = fortuneService;
//    }

    // define a setter method
//    @Autowired
//    public void setFortuneService(FortuneService theFortuneService) {
//        System.out.println(">> TennisCoach: inside setFortuneService");
//        fortuneService = theFortuneService;
//    }

//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your Tennis";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
