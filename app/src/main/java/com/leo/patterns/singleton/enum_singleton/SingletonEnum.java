package com.leo.patterns.singleton.enum_singleton;

/**
 * 枚举单例
 * 枚举不仅能够有字段，还能有自己的方法；默认枚举实例的创建是线程安全的，并且在任何情况下都只有一个实例
 */
public enum  SingletonEnum {
    INSTANCE;

    public void doSomething(){

    }
}
