package com.youxiu326;

import com.youxiu326.abst.Beverage;
import com.youxiu326.realize.Espresso;
import com.youxiu326.realize.HouseBlend;
import com.youxiu326.realize.Mocha;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + " $ " + beverage1.cost());

    }

} 