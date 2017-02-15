package com.ait.www.patterns.factory.abs;

/**
 * Created by zhenouyang on 2017/2/15.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    public Pepperoni createPepperoni() {
        return null;
    }

    public Clams createClams() {
        return new FreshClams();
    }
}
