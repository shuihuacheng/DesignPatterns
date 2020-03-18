package com.leo.patterns.chain_of_responsibility;

/**
 * 抽象请求者
 */
public abstract class AbstractRequest {
    //处理对象
    private Object obj;

    public AbstractRequest(Object obj) {
        this.obj = obj;
    }

    public Object getContent(){
        return obj;
    }

    public abstract int getRequestLevel();
}
