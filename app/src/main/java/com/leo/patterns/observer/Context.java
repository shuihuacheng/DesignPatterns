package com.leo.patterns.observer;

public class Context {
    public static void main(String[] args) {
        DevTechFrontier devTechFrontier = new DevTechFrontier();
        Coder code1 = new Coder("coder-1");
        Coder code2 = new Coder("coder-2");
        Coder code3 = new Coder("coder-3");

        devTechFrontier.addObserver(code1);
        devTechFrontier.addObserver(code2);
        devTechFrontier.addObserver(code3);

        devTechFrontier.postNewPublication("新的一期开发技术前线周报发布啦!");
    }
}
