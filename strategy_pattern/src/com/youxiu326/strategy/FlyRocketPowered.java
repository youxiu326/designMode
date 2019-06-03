package com.youxiu326.strategy;

import com.youxiu326.inter.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("火箭动力飞行");
    }
}