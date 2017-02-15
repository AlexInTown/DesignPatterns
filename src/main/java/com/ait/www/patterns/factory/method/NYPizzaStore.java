package com.ait.www.patterns.factory.method;

/**
 * Created by zhenouyang on 2017/2/10.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if("cheese".equals(type)){
            return new NYStyleCheesePizza();
        }
        return null;
    }
}
