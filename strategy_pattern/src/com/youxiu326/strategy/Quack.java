package com.youxiu326.strategy;

import com.youxiu326.inter.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("鸭子呱呱叫");
    }
}