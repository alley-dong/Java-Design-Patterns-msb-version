package com.dongchanglong.demo01;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        State stateA = new ConcreteStateA();
        stateA.handleState(context);
        System.out.println(context.getCurrentState().toString());

        State stateB = new ConcreteStateB();
        stateB.handleState(context);
        System.out.println(context.getCurrentState().toString());
    }
}
