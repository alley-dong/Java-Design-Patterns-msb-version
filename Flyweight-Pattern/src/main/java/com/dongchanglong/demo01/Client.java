package com.dongchanglong.demo01;

public class Client {

    public static void main(String[] args) {

        // 获取工厂对象
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        // 通过工厂对象获取共享享元对象
        Flyweight a1 = flyweightFactory.getFlyweight("A");
        a1.operation("a1ExState");
        Flyweight a2 = flyweightFactory.getFlyweight("A");
        a2.operation("a2ExState");
        System.out.println(a1 == a2);

        // 获取非共享的享元对
        UnSharedFlyweight u1 = new UnSharedFlyweight("A");
        UnSharedFlyweight u2 = new UnSharedFlyweight("A");
        System.out.println(u1 == u2);
    }
}
