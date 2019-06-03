package com.youxiu326.realize;

import com.youxiu326.abst.AbsPizzaStore;
import com.youxiu326.inter.Pizza;

/**
 * 中国开的披萨店
 */
public class ChinaStylePizzaStore extends AbsPizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = null;
        }else if (type.equals("clam")){
            pizza = null;
        }

        return pizza;
    }
}