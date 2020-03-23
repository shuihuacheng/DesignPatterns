package com.leo.patterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 程序员是观察者
 */
public class Coder implements Observer {
    public String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("Hi, "+name+",DevTechFrontier更新啦，内容: "+o);
    }
}
