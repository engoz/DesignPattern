package com.eng;

import java.util.Timer;
import java.util.TimerTask;

public class ThrottleTimerImpl implements Throtter{

    private final int throttlePeriod;
    private final CallsCount callsCount;

    public ThrottleTimerImpl(int throttlePeriod, CallsCount callsCount) {
        this.throttlePeriod = throttlePeriod;
        this.callsCount = callsCount;
    }

    @Override
    public void start() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                callsCount.reset();
            }
        },0,throttlePeriod);
    }
}
