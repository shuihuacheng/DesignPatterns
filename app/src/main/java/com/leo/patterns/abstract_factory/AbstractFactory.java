package com.leo.patterns.abstract_factory;

/**
 * 抽象工厂
 */
public abstract class AbstractFactory {
    /**
     * 创建产品A的方法
     */
    public abstract AbstractProductA createProductA();
    /**
     * 创建产品B的方法
     */
    public abstract AbstractProductB createProductB();
}
