package com.youxiu326.realize;

import com.youxiu326.strategy.Duck;
import com.youxiu326.strategy.FlyNoWay;
import com.youxiu326.strategy.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("i m a model duck");
    }
}