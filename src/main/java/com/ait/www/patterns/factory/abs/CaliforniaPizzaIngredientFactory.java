package com.ait.www.patterns.factory.abs;

/**
 * Created by zhenouyang on 2017/2/15.
 */

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new VeryThinCrust();
    }

    public Sauce createSauce() {
        return new BruschettaSauce();
    }

    public Cheese createCheese() {
        return new GoatCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    public Pepperoni createPepperoni() {
        return null;
    }

    public Clams createClams() {
        return new Calamari();
    }
}