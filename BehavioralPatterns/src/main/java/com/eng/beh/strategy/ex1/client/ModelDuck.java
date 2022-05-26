package com.eng.beh.strategy.ex1.client;


import com.eng.beh.strategy.ex1.abstracts.Duck;
import com.eng.beh.strategy.ex1.impl.FlyNoWay;
import com.eng.beh.strategy.ex1.impl.Quack;

/**
 * Created by enginoz on 2/8/16.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
