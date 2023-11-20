package com.dongchanglong.even;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 监听事件
 */
@Component
public class RequestListener implements ApplicationListener<RequestEvent> {
    @Override
    public void onApplicationEvent(RequestEvent event) {
        System.out.println("监听到RequestEvent事件,执行本方法");
    }
}
