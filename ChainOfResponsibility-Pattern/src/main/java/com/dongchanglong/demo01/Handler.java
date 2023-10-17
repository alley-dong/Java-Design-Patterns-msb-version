package com.dongchanglong.demo01;

/**
 * 抽象的处理者类
 * @date 2023/9/27 20:34
 * @author DongCL
 */
public abstract class Handler {

    // 后继处理者的引用
    protected Handler successor;
    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public abstract void handler(RequestData requestData);
}
