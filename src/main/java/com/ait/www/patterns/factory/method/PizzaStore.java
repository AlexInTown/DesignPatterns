package com.ait.www.patterns.factory.method;

import com.ait.www.patterns.factory.Pizza;

/**
 * Created by zhenouyang on 2017/2/10.
 */
// 不创建具体类是为了避免被直接依赖
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // 允许子类做决定，创建对象延迟到子类
    // 包内可用，不同包子类可用，抽象方法
    protected abstract Pizza createPizza(String type);
}
