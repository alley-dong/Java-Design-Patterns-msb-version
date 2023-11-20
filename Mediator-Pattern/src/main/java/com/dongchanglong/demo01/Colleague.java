package com.dongchanglong.demo01;

/**
 * 抽象同事类
 * @date 2023/11/7 21:19
 * @author DongCL
 */
public abstract class Colleague {

    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void exec(String key);
}