package com.ait.www.patterns.strategy;

/**
 * Created by zhenouyang on 2017/2/9.
 */

public class MiniDuckSimulator {
    public static class MallardDuck extends Duck {
        public MallardDuck(){
            quakeBehavior = new QuakeBehavior.Quake();
            flyBehavior = new FlyBehavior.FlyWithWings();
        }
    }

    public static class ModelDuck extends Duck {
        public ModelDuck(){
            quakeBehavior = new QuakeBehavior.Squeak();
            flyBehavior = new FlyBehavior.FlyWithRockets();
        }
    }

    public static void main(String[] args){
        MallardDuck mallardDuck = new MallardDuck();
        ModelDuck modelDuck = new ModelDuck();

        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performQuake();
        mallardDuck.performFly();
        System.out.println();

        modelDuck.display();
        modelDuck.swim();
        modelDuck.performQuake();
        modelDuck.performFly();

    }
}