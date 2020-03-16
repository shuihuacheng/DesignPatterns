package com.leo.patterns.factory;

//具体调用
public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product p = factory.createProduct(ConcreteProductA.class);
        p.method();
    }
}
