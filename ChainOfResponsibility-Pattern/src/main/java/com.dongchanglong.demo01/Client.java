package com.dongchanglong.demo01;

public class Client {
    public static void main(String[] args) {
        Handler handlerA = new HandlerA();
        Handler handlerB = new HandlerB();
        Handler handlerC = new HandlerC();

        // 创建处理链
        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);

        RequestData requestData = new RequestData("请求数据:ABCD");
        // 调用处理链头部的方法
        handlerA.handler(requestData);
    }
}
