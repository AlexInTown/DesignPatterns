package com.ait.www.patterns.factory.method;

/**
 * Created by zhenouyang on 2017/2/15.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name = "Chicago style deep dish cheese pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut(){
       System.out.println("Cutting the pizza into square slices") ;
    }

}
