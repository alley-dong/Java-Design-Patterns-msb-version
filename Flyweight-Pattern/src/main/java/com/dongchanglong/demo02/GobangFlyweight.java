package com.dongchanglong.demo02;

/**
 * 抽象享元类：五子棋
 * @date 2023/9/20 21:55
 * @author DongCL
 */
public abstract class GobangFlyweight {
    public abstract String getColor();
    public void display(){
        System.out.println("棋子颜色："+ this.getColor());
    }
}
