package com.ait.www.patterns.factory.abs;

/**
 * Created by zhenouyang on 2017/2/15.
 */
public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientFactory();
        if("cheese".equals(type)){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York style cheese pizza");
        }else if("clam".equals(type)){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York sytle clam pizza");
        }
        return pizza;
    }
}
