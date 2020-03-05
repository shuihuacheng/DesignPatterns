package com.leo.patterns.builder;

/**
 * 具体产品
 */
public class Macbook extends Computer {

    protected Macbook(){}

    @Override
    public void setOS() {
        mOS = "Mac OS X 10.14.6";
    }
}
