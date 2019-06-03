package com.youxiu326.realize;

import com.youxiu326.abst.Beverage;

/**
 *  新型咖啡
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend 新型咖啡";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 0.89;
    }
}