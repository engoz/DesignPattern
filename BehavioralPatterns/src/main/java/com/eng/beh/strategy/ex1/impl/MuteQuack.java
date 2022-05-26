package com.eng.beh.strategy.ex1.impl;


import com.eng.beh.strategy.ex1.interfaces.QuackBehavior;

/**
 * Created by enginoz on 2/8/16.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
