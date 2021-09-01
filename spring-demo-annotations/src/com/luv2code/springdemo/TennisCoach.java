package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

// set up bean id @Component("thatSillyCoach")
@Component //default is classname but first letter is lower case
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice your Tennis";
    }
}
