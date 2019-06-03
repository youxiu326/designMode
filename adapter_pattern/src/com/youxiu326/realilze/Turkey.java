package com.youxiu326.realilze;

import com.youxiu326.inter.Duck;

public class Turkey implements Duck {
    @Override
    public void quack() {
        System.out.println("turkey quack");
    }

    @Override
    public void fly() {
        System.out.println("turkey fly");
    }
}