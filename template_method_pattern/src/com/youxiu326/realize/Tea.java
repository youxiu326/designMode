package com.youxiu326.realize;

import com.youxiu326.abst.CaffeineBeverage;

/**
 * 茶
 *
 * 1.把水煮沸
 * 2.用沸水浸泡茶叶
 * 3.把茶倒进杯子
 * 4.加柠檬
 *
 */
public class Tea extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println(" steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("adding lemon");
    }
}