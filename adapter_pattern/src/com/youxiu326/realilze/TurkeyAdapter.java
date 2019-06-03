package com.youxiu326.realilze;

import com.youxiu326.inter.Duck;

/**
 * 鸭子适配器
 */
public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.quack();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}