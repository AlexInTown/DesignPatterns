package com.ait.www.patterns.factory.method;

/**
 * Created by zhenouyang on 2017/2/15.
 */
public class PizzaTestDrive {
    public static void main(String[] args){
        PizzaStore nyPizzaStore= new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println();
        pizza = chicagoPizzaStore.orderPizza("cheese");

    }

}
