package com.dongchanglong.demo01;

/**
 * 具体观察者
 */
public class ConcreteObserver01 implements Observer{
    @Override
    public void update() {
        System.out.println("ConcreteObserver01 接到通知");
    }
}
