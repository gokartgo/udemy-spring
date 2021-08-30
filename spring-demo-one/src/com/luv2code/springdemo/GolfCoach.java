package com.luv2code.springdemo;

public class GolfCoach implements Coach{
    FortuneService fortuneService;

    public GolfCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "practice hole in one";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
