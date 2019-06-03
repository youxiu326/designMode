package com.youxiu326.realize;

import com.youxiu326.abst.Beverage;
import com.youxiu326.abst.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+ ",Mocha";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}