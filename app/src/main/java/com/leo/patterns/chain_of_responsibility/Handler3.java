package com.leo.patterns.chain_of_responsibility;

public class Handler3 extends AbstractHandler{
    @Override
    protected int getHandleLevel() {
        return 3;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handler3 handle request:"+request.getRequestLevel());
    }
}
