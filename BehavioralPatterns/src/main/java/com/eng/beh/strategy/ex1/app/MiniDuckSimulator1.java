package com.eng.beh.strategy.ex1.app;


import com.eng.beh.strategy.ex1.abstracts.Duck;
import com.eng.beh.strategy.ex1.client.MallardDuck;
import com.eng.beh.strategy.ex1.client.ModelDuck;
import com.eng.beh.strategy.ex1.impl.FlyRocketPowered;

/**
 * Created by enginoz on 2/8/16.
 */
public class MiniDuckSimulator1 {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
