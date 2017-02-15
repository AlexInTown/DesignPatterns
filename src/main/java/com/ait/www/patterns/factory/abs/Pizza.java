package com.ait.www.patterns.factory.abs;

/**
 * Created by zhenouyang on 2017/2/15.
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggies[] veggies;
    Pepperoni pepperoni; //意大利腊香肠
    Clams clams;

    abstract void prepare();

    void bake(){

    }

    void box(){

    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }


}
