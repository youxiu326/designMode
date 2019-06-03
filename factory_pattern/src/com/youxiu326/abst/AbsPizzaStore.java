package com.youxiu326.abst;

import com.youxiu326.inter.Pizza;

/**
 * 抽象披萨制作工厂
 */
public abstract class AbsPizzaStore {

    public Pizza orderPizza(String type){

        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        pizza.box();
        return pizza;
    }

    /**
     * 留给子类扩展(让子类做决定)
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);

} 