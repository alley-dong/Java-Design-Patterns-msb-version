package com.dongchanglong.even;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * 事件
 */
public class RequestEvent extends ApplicationEvent {
    public RequestEvent(Object source) {
        super(source);
    }
}
