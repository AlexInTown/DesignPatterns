package com.ait.www.patterns.strategy;

/**
 * Created by zhenouyang on 2017/2/9.
 */
public interface QuakeBehavior {
    void quake();

    class Quake implements QuakeBehavior {
        public void quake(){
            System.out.println("I'm quaking!");
        }
    }

    class Squeak implements QuakeBehavior {
        public void quake(){
            System.out.println("I'm squeaking!");
        }
    }

}
