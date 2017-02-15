package com.ait.www.patterns.singleton;

/**
 * Created by zhenouyang on 2017/2/15.
 */
public class Singleton {
    private static volatile Singleton instance = null;

    private Singleton(){}

    /**
     * get instance with double-checked locking technique
     * @return
     */
    public static Singleton getInstance(){
        if(instance == null){
            // when instance not created, then lock
            synchronized (Singleton.class){
                // check again, because might be created by other thread
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
