package com.ait.www.patterns.strategy;

/**
 * Created by zhenouyang on 2017/2/9.
 */
public class Duck {
    FlyBehavior flyBehavior;
    QuakeBehavior quakeBehavior;

    public void performQuake(){
        quakeBehavior.quake();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
    public void swim(){
        System.out.println("Swim like a normal duck..");
    }
    public void display(){
        System.out.println("Showing like a normal duck \n" +
                ">(' )\n" +
                "  )/\n" +
                " /( \n" +
                "/  `----/ \n" +
                "\\  ~=- /");
    }


    public void setQuakeBehavior(QuakeBehavior quakeBehavior){
        this.quakeBehavior = quakeBehavior;
    }
}
