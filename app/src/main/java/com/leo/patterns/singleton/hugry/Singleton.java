package com.leo.patterns.singleton.hugry;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 饿汉模式
 * 优点:单例只在使用时才会被实例化，一定程度上节约了资源
 * 缺点:第一次加载时需要及时实例化，反应稍慢；每次调用getInstance方法都会同步，造成不必要的同步开销；不建议使用
 */
public class Singleton implements Serializable {
    private static final long serialVersionUID = 0L;

    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return  instance;
    }

    /**
     * 反序列化时提供了很特别的钩子函数，类中有一个私有的readResolve()来控制对象的反序列化
     */
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
