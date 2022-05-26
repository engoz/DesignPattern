package com.eng.beh.strategy.ex1.impl;


import com.eng.beh.strategy.ex1.interfaces.FlyBehavior;

/**
 * Created by enginoz on 2/8/16.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
