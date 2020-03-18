package com.leo.patterns.chain_of_responsibility;

/**
 * 抽象处理者
 */
public abstract class AbstractHandler {
    //下一个节点上的处理者对象
    protected AbstractHandler nextHandler;
    //获取处理者对象的处理级别
    protected abstract int getHandleLevel();
    //每个处理者对象的具体处理方式
    protected abstract void handle(AbstractRequest request);

    public final void handleRequest(AbstractRequest request){
        if(getHandleLevel() == request.getRequestLevel()){
            handle(request);
        }else{
            if(nextHandler != null){
                nextHandler.handleRequest(request);
            }else{
                System.out.println("All of handler can not handle the request");
            }
        }
    }
}
