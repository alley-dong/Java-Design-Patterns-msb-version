package com.dongchanglong.demo01;

/**
 * 策略实现
 * @date 2023/9/26 14:33
 * @author DongCL
 */
public class ConcreteStrategyA implements Strategy{
    @Override
    public void algorithm() {
        System.out.println("执行策略A");
    }
}
