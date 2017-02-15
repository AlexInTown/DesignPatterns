package com.ait.www.patterns.factory.method;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhenouyang on 2017/2/10.
 */
public abstract class Pizza {
    String name;
    String dough;    // 面团
    String sauce;    // 酱料
    List<String> toppings = new ArrayList<String>();  //佐料
    public void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough "+ dough);
        System.out.println("Adding sauce " + sauce);
        System.out.println("Adding toppings: ");
        for(int i = 0; i < toppings.size(); ++i)
            System.out.print(" " + toppings.get(i));
        System.out.println();
    }
    public void bake(){
        System.out.println("Baking for 25 minuts ...");
    }
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices.");
    }
    public void box(){
        System.out.println("Place the pizza in official PizzaStore box. ");
    }

    public String getName(){
        return name;
    }
}
