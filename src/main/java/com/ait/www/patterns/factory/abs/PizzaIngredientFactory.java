package com.ait.www.patterns.factory.abs;

/**
 * Created by zhenouyang on 2017/2/15.
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
