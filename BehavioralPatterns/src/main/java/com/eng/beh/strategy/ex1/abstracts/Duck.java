package com.eng.beh.strategy.ex1.abstracts;


import com.eng.beh.strategy.ex1.interfaces.FlyBehavior;
import com.eng.beh.strategy.ex1.interfaces.QuackBehavior;

/**
 * Created by enginoz on 2/8/16.
 */
public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public Duck(){}

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys !");
    }
}
