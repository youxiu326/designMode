package com.youxiu326.strategy;

import com.youxiu326.inter.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("实现鸭子的飞行动作");
    }
}