package com.youxiu326.abst;

/**
 * 咖啡因饮料 抽象类
 *
 * 1.把水煮沸
 * 2.冲泡
 * 3.把饮料倒进杯子
 * 4.加调料
 *
 */
public abstract class CaffeineBeverage {

    /**
     * 不希望子类覆盖这个方法 申明为 final
     */
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }


    /**
     * 因为咖啡和茶这两个做法不同 声明为抽象
     */
    protected abstract void brew();

    protected abstract void addCondiments();

    void boilWater(){
        System.out.println(" 把水煮沸");
    }
    void pourInCup(){
        System.out.println(" 把饮料倒进杯子");
    }

    void hook(){
        System.out.println("这是一个钩子 子类可以覆盖也可不覆盖");
    }

} 