package com.ait.www.patterns.singleton;

/**
 * Created by zhenouyang on 2017/2/15.
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){}
    public EagerSingleton getInstance(){
        return instance;
    }

}
