package com.dongchanglong.demo01;

/**
 * 非共享的具体享元类
 */
public class UnSharedFlyweight extends Flyweight{

    private String inState;

    public UnSharedFlyweight(String inState) {
        this.inState = inState;
    }

    @Override
    public void operation(String state) {
        System.out.println("=== 使用不共享对象，内部状态："+ inState + ",外部状态：" + state);
    }
}
