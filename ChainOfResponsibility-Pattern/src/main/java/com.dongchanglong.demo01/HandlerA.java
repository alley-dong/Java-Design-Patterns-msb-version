package com.dongchanglong.demo01;

public class HandlerA extends Handler{
    @Override
    public void handler(RequestData requestData) {
        System.out.println("HandlerA 执行代码逻辑！ 处理："+requestData.getData());
        requestData.setData(requestData.getData().replace("A",""));
        // 判断是否向后继续调用处理器
        if (successor != null){
            successor.handler(requestData);
        }else {
            System.out.println("执行中止");
        }
    }
}
