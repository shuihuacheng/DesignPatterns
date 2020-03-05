package com.leo.patterns.builder;

import androidx.annotation.NonNull;

/**
 *  抽象产品
 */
public abstract class Computer {
    protected String mBorad;
    protected String mDisplay;
    protected String mOS;

    protected Computer(){}

    public void setBoard(String board){
        this.mBorad = board;
    }

    public void setDisplay(String display){
        this.mDisplay = display;
    }

    public abstract void setOS();

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
