package com.dongchanglong.demo01;

public class Client {
    public static void main(String[] args) {
        Strategy concreteStrategyA = new ConcreteStrategyA();
        Context context = new Context(concreteStrategyA);

    }
}
