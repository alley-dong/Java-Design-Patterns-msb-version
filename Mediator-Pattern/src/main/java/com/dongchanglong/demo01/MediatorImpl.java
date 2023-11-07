package com.dongchanglong.demo01;

/**
 * 具体中介者
 * @date 2023/11/7 21:18
 * @author DongCL
 */
public class MediatorImpl implements Mediator {

    @Override
    public void apply(String key) {
        System.out.println("最终中介者执行操作,key为: " + key);
    }
}