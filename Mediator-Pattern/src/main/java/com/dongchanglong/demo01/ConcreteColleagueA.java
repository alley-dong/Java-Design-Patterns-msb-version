package com.dongchanglong.demo01;

/**
 * 具体同事类A
 * @date 2023/11/7 21:19
 * @author DongCL
 */
public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void exec(String key) {
        System.out.println("====在组件A中,通过中介者执行!");
        getMediator().apply(key);
    }
}