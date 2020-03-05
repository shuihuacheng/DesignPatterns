package com.leo.patterns.builder;

/**
 * 导演类，负责构造Computer
 */
public class Director {
    Builder mBuilder = null;

    public Director(Builder builder){
        this.mBuilder = builder;
    }

    public void construct(String board,String display){
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }
}
