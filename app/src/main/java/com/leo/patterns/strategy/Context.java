package com.leo.patterns.strategy;

/**
 * 操作策略的上下文环境
 */
public class Context {
    Strategy mStrategy;

    public void setStrategy(Strategy mStrategy) {
        this.mStrategy = mStrategy;
    }

    public void algorithm(){
        if(mStrategy != null){
            mStrategy.algorithm();
        }
    }
}
