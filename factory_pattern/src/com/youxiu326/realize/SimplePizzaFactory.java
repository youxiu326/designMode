package com.youxiu326.realize;

import com.youxiu326.inter.Pizza;

/**
 * 披萨简单生产工厂
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = null;
        }else if (type.equals("clam")){
            pizza = null;
        }

        return pizza;
    }

} 