package com.dongchanglong.even;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 发布事件
 */
@Component
public class Request {

    @Autowired
    private ApplicationContext applicationContext;

    public void doRequest(){
        System.out.println("调用Request类的doRequest方法发送一个请求......");

        // 发布事件，事件源就是当前类
        applicationContext.publishEvent(new RequestEvent(this));
    }
}
