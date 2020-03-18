package com.leo.patterns.chain_of_responsibility;

public class Request1 extends AbstractRequest {

    public Request1(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 1;
    }
}
