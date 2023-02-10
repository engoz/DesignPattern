package com.eng;

import lombok.Getter;

public class BarConsumer {
    @Getter
    private final  String name;

    @Getter
    private final int allowedCallsPerSecond;

    public BarConsumer(String name, int allowedCallsPerSecond,CallsCount callsCount) {
        this.name = name;
        this.allowedCallsPerSecond = allowedCallsPerSecond;
        callsCount.addTenant(name);
    }
}
