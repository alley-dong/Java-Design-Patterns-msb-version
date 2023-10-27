package com.dongchanglong.demo01;

import lombok.Data;

/**
 * 上下文类
 */
@Data
public class Context {
    // 维持一个状态
    private State currentState;
    public Context() {
        currentState = null;
    }
}
