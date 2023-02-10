package com.eng;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class CallsCount {


    private  final Map<String, AtomicLong> tenantCallsCount = new ConcurrentHashMap<>();

    public void addTenant(String tenantName){
        tenantCallsCount.putIfAbsent(tenantName, new AtomicLong(0));
    }

    public long incremantCount(String name){
        return tenantCallsCount.get(name).incrementAndGet();
    }

    public long getcount(String tenantName){
        return tenantCallsCount.get(tenantName).get();
    }

    public void reset(){
        tenantCallsCount.replaceAll((k,v)-> new AtomicLong(0));
    }

}
