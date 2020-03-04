package com.leo.patterns.singleton.static_inner;

/**
 * 静态内部类
 * 第一次调用getInstance方法会导致虚拟机加载SingletonHolder类，确保线程安全，也保证单例对象的唯一性，同时也延迟了单例的实例化；推荐!
 */
public class Singleton {
    private Singleton(){}

    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }

    private static class SingletonHolder{
        private static final Singleton instance = new Singleton();
    }
}
