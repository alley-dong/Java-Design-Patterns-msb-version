package com.dongchanglong.demo01;

/**
 * 状态A
 */
public class ConcreteStateA implements State{
    @Override
    public void handleState(Context context) {
        System.out.println("进入状态模式A......");
        context.setCurrentState(this);
    }

    @Override
    public String toString() {
        return "当前状态: ConcreteStateA";
    }
}
