package com.leo.patterns.state;

public class ConcreteStateB implements IState {
    @Override
    public void dosomething1() {
        System.out.println("状态B-方法1");
    }

    @Override
    public void dosomething2() {
        System.out.println("状态B-方法2");
    }
}
