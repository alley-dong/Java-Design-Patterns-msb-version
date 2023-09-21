package com.dongchanglong.demo01;

/**
 * 具体观察者
 */
public class ConcreteObserver02 implements Observer{
    @Override
    public void update() {
        System.out.println("ConcreteObserver02 接到通知");
    }
}
