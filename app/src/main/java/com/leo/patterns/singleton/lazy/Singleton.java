package com.leo.patterns.singleton.lazy;

/**
 * 懒汉模式
 *
 */
public class Singleton {
    private static Singleton instance;

    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
