package com.leo.patterns.command;

/**
 * 请求者类
 */
public class Invoker {
    //持有一个相应命令对象的引用
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        //调用具体命令对象的相关方法，执行具体命令
        command.execute();
    }
}
