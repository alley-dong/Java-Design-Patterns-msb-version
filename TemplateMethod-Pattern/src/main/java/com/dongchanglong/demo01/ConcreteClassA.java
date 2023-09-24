package com.dongchanglong.demo01;

public class ConcreteClassA extends AbstractClassTemplate{
    @Override
    void step3() {
        System.out.println("在子类A中 实现步骤3");
    }

    @Override
    void step4() {
        System.out.println("在子类A中 实现步骤4");
    }
}
