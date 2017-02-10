package com.ait.www.patterns.factory;

/**
 * Created by zhenouyang on 2017/2/10.
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(){
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough"; // 薄皮
        sauce = "Marinara Sauce";  //大蒜番茄酱
        toppings.add("Grated Reggiano Cheese"); // 意大利Reggiano 高级奶酪
    }
}
