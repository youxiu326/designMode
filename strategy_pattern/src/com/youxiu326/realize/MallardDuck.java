package com.youxiu326.realize;

import com.youxiu326.strategy.Duck;
import com.youxiu326.strategy.FlyWithWings;
import com.youxiu326.strategy.Quack;

public class MallardDuck extends Duck {

    /**
     * 绿头鸭 使用Quack类处理呱呱叫
     * 绿头鸭 使用FlyWithWings处理飞
     */
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("i m a real Mallard duck");
    }
}