package com.eng;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ThreadLocalRandom;

public class Bartender {

//    private static final Logger LOGGER = LoggerFactory.getLogger(Bartender.class);
    private final CallsCount callsCount;

    public Bartender(Throtter throtter, CallsCount callsCount) {
        this.callsCount = callsCount;
        throtter.start();
    }

    public int orderDrink(BarConsumer barConsumer){
        String name = barConsumer.getName();
        int allowedCallsPerSecond = barConsumer.getAllowedCallsPerSecond();
        long count = callsCount.incremantCount(name);
        if (count >= allowedCallsPerSecond){
            System.out.println("I am sorry {}, you've had enough for today !" + name);
            return -1;
        }

        callsCount.incremantCount(name);
        System.out.println("Serving beer to {} : [{} consumed ]" + name + " " + count+1);
        return getRandomCustomerId();
    }

    private int getRandomCustomerId() {
        return ThreadLocalRandom.current().nextInt(1,10000);
    }

}
