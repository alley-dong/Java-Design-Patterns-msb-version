package com.dongchanglong.demo01;

public class HandlerC extends Handler{
    @Override
    public void handler(RequestData requestData) {
        System.out.println("HandlerC 执行代码逻辑！ 处理："+requestData.getData());
        requestData.setData(requestData.getData().replace("C",""));
        // 判断是否向后继续调用处理器
        if (successor != null){
            successor.handler(requestData);
        }else {
            System.out.println("执行中止");
        }
    }
}
