package com.eng.beh.strategy.ex1.client;


import com.eng.beh.strategy.ex1.abstracts.Duck;
import com.eng.beh.strategy.ex1.impl.FlyWithWings;
import com.eng.beh.strategy.ex1.impl.Quack;

/**
 * Created by enginoz on 2/8/16.
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
