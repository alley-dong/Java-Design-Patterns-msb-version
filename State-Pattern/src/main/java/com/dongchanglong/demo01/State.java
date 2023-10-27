package com.dongchanglong.demo01;

/**
 * 抽象状态接口
 */
public interface State {
    // 抽象方法  不同具体状态有不同的实现
    void handleState(Context context);
}
