package com.dongchanglong.demo01;

import java.util.ArrayList;

/**
 * 具体被观察者
 * @date 2023/9/21 21:16
 * @author DongCL
 */
public class ConcreteSubject implements Subject{
    // 定义集合 存储所有的观察者
    private ArrayList<Observer> observers = new ArrayList<>();

    // 注册方法，向观察者集合增加观察者
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // 注销方法，从观察者集合中移除观察者
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // 通知方法
    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
