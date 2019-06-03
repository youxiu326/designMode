package com.youxiu326.realize;

import com.youxiu326.abst.Beverage;

/**
 * 浓缩咖啡饮料
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso 浓缩咖啡";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}