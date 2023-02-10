package com.eng;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Main {


    public static void main(String[] args) {
        CallsCount callsCount = new CallsCount();
        BarConsumer human = new BarConsumer("young human", 2, callsCount);
        BarConsumer dwarf = new BarConsumer("dwarf solder", 4,callsCount);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(()->makeServiceCalls(human,callsCount));
        executorService.execute(()->makeServiceCalls(dwarf,callsCount));
    }

    private static void makeServiceCalls(BarConsumer barConsumer, CallsCount callsCount) {
//        Logger LOGGER = LoggerFactory.getLogger(Main.class);
        ThrottleTimerImpl throttleTimer = new ThrottleTimerImpl(1000, callsCount);
        Bartender bartender = new Bartender(throttleTimer, callsCount);
        IntStream.range(0,50).forEach(i->{
            bartender.orderDrink(barConsumer);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
    //            LOGGER.error("Thread Interrupted {} ", e.getMessage());
            }
        });
    }
}