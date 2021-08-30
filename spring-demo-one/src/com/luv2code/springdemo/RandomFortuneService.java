package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService{
    private String[] fortune = {"1","2","3"};
    private Random random = new Random();
    @Override
    public String getFortune() {
        int int_random = random.nextInt(3);
        return fortune[int_random];
    }
}
