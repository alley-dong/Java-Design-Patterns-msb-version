package com.dongchanglong.demo01;

/**
 * 抽象观察者
 * @date 2023/9/21 21:09
 * @author DongCL
 */
public interface Observer {
    // update方法：为不同的观察者更新行为定义一个相同的接口，不同的观察者对接口有不同的实现。
    public void update();
}
