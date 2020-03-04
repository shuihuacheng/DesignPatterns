package com.leo.patterns.singleton.dcl;

/**
 * Double Check Lock(DCL)模式
 * 优点:能够在需要时才初始化单例，又能保证线程安全，且单例对象初始化后调用getInstance不进行同步锁
 * 缺点:第一次加载时反应稍慢，由于Java内存模型的原因偶尔会失败，在高并发是也有一定缺陷(双重检查锁定DCL失效)
 */
public class Singleton {
    private static volatile Singleton instance = null;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
