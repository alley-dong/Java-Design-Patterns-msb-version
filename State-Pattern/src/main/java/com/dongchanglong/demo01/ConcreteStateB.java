package com.dongchanglong.demo01;

/**
 * 状态B
 */
public class ConcreteStateB implements State{
    @Override
    public void handleState(Context context) {
        System.out.println("进入状态模式B......");
        context.setCurrentState(this);
    }

    @Override
    public String toString() {
        return "当前状态: ConcreteStateB";
    }
}
