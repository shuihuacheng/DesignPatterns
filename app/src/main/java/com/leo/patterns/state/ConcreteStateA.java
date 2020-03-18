package com.leo.patterns.state;

/**
 * 具体状态
 */
public class ConcreteStateA implements IState {

    @Override
    public void dosomething1() {
        System.out.println("状态A-方法1");
    }

    @Override
    public void dosomething2() {
        System.out.println("状态A-方法2");
    }
}
