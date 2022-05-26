package com.eng.beh.strategy.ex1.app;


import com.eng.beh.strategy.ex1.client.DecoyDuck;
import com.eng.beh.strategy.ex1.client.MallardDuck;
import com.eng.beh.strategy.ex1.client.ModelDuck;
import com.eng.beh.strategy.ex1.client.RubberDuck;
import com.eng.beh.strategy.ex1.impl.FlyRocketPowered;

/**
 * Created by enginoz on 2/8/16.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {

        MallardDuck mallard = new MallardDuck();
        RubberDuck rubberDuckie = new RubberDuck();
        DecoyDuck decoy = new DecoyDuck();

        ModelDuck model = new ModelDuck();

        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}

