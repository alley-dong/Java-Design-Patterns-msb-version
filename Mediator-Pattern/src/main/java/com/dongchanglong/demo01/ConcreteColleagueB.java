package com.dongchanglong.demo01;

/**
 * 具体同事类B
 * @date 2023/11/7 21:19
 * @author DongCL
 */
public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void exec(String key) {
        System.out.println("====在组件B中,通过中介者执行!");
        getMediator().apply(key);
    }
}