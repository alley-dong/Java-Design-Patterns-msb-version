package com.dongchanglong.demo02;

public class Client {

    public static void main(String[] args) {

        //获取享元工厂对象
        GobangFactory instance = GobangFactory.getInstance();

        //获取3颗黑子
        GobangFlyweight b1 = instance.getGobang("B");
        GobangFlyweight b2 = instance.getGobang("B");
        GobangFlyweight b3 = instance.getGobang("B");
        System.out.println("判断两颗黑子是否相同: " + (b1 == b2));

        //获取2颗白子
        GobangFlyweight w1 = instance.getGobang("W");
        GobangFlyweight w2 = instance.getGobang("W");
        System.out.println("判断两颗白子是否相同: " + (w1 == w2));

        //显示棋子
        b1.display();
        b2.display();
        b3.display();
        w1.display();
        w2.display();
    }
}
