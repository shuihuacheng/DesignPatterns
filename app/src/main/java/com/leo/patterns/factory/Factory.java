package com.leo.patterns.factory;

/**
 * 抽象工厂类
 */
public abstract class Factory {
    /**
     * 抽象工厂方法
     * 具体生产什么由子类去实现
     * @return
     */
//    public abstract Product createProduct();

    /**
     * 抽象工厂方法
     * 具体生产什么由子类去实现
     * @param clz 产品对象类型
     * @return
     */
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
