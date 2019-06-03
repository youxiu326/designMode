package com.youxiu326;

import com.youxiu326.realize.MallardDuck;
import com.youxiu326.realize.ModelDuck;
import com.youxiu326.strategy.Duck;
import com.youxiu326.strategy.FlyRocketPowered;

public class RemoteControlTest {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("==============");

        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }

}