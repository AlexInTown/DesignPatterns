package com.ait.www.patterns.factory.method;

import com.ait.www.patterns.factory.Pizza;

/**
 * Created by zhenouyang on 2017/2/10.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        return null;
    }
}
