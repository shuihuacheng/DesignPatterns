package com.leo.patterns.state;

/**
 * 上下文环境
 * 维护一个状态State的实例，对应当前所处状态
 */
public class Context implements IController {
    IState mState;

    public void setState(IState mState) {
        this.mState = mState;
    }


    @Override
    public void actionA() {
        setState(new ConcreteStateA());
        System.out.println("切换状态A");
    }

    @Override
    public void actionB() {
        setState(new ConcreteStateB());
        System.out.println("切换状态B");
    }
}
