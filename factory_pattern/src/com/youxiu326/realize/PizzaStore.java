package com.youxiu326.realize;

import com.youxiu326.inter.Pizza;

/**
 * 披萨制作工厂
 */
public class PizzaStore {

    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = null;
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        pizza.box();
        return pizza;
    }
}