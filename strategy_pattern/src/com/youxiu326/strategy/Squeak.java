package com.youxiu326.strategy;

import com.youxiu326.inter.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("橡皮鸭子吱吱叫");
    }
}