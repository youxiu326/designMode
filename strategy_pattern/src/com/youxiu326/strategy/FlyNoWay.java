package com.youxiu326.strategy;

import com.youxiu326.inter.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        //什么都不做，不会飞
        System.out.println("i can't fly ");
    }
}