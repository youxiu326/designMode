package com.youxiu326.realize;

import com.youxiu326.abst.CaffeineBeverage;

/**
 * 咖啡
 *
 * 1.把水煮沸
 * 2.用沸水冲泡咖啡粉
 * 3.把咖啡倒进杯子
 * 4.加糖和牛奶
 *
 */
public class Coffee extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println(" dripping coffee through filter ");
    }

    @Override
    protected void addCondiments() {
        System.out.println("adding sugar and milk");
    }
}