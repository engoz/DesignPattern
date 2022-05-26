package com.eng.beh.strategy.ex1.client;


import com.eng.beh.strategy.ex1.abstracts.Duck;
import com.eng.beh.strategy.ex1.impl.FlyNoWay;
import com.eng.beh.strategy.ex1.impl.MuteQuack;

/**
 * Created by enginoz on 2/8/16.
 */
public class DecoyDuck extends Duck {

    public DecoyDuck (){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }


    @Override
    public void display() {
        System.out.println("I am a duck Decoy");
    }
}
