package com.eng.beh.strategy.ex1.client;


import com.eng.beh.strategy.ex1.abstracts.Duck;
import com.eng.beh.strategy.ex1.impl.FlyNoWay;
import com.eng.beh.strategy.ex1.impl.Squeak;

/**
 * Created by enginoz on 2/8/16.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}
