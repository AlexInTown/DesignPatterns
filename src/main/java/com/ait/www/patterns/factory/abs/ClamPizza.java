package com.ait.www.patterns.factory.abs;

/**
 * Created by zhenouyang on 2017/2/15.
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public ClamPizza(PizzaIngredientFactory factory){
        ingredientFactory = factory;
    }

    @Override
    void prepare() {
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClams();

    }
}
