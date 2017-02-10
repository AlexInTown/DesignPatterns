package com.ait.www.patterns.strategy;

/**
 * Created by zhenouyang on 2017/2/9.
 */
public interface FlyBehavior {
    void fly();

    class FlyWithWings implements FlyBehavior{
        public void fly() {
            System.out.println("I'm flying with wings!");
        }
    }

    class FlyNoWay implements FlyBehavior {
        public void fly(){
            System.out.println("I can't fly!");
        }
    }

    class FlyWithRockets implements FlyBehavior {
        public void fly(){
            System.out.println("I'm flying with a rocket!!");
        }
    }


}