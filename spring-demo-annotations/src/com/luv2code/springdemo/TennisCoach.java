package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// set up bean id @Component("thatSillyCoach")
@Component //default is classname but first letter is lower case
public class TennisCoach implements Coach {
    // use auto wired in dependency injection
    @Autowired
    @Qualifier("RESTFortuneService")
    private FortuneService fortuneService;
    // define a default constructor
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
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
