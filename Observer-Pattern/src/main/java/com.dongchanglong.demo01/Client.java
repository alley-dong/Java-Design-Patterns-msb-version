package com.dongchanglong.demo01;

public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver01());
        subject.attach(new ConcreteObserver02());

        subject.notifyObserver();
    }
}
