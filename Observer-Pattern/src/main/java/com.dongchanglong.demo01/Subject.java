package com.dongchanglong.demo01;

/**
 * 抽象被观察者
 * @date 2023/9/21 21:14
 * @author DongCL
 */
public interface Subject {
    public void attach(Observer observer);
    public void detach(Observer observer);
    public void notifyObserver();
}
