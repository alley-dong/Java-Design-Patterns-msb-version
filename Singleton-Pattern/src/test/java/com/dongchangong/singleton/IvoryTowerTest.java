package com.dongchangong.singleton;

import com.dongchanglong.singleton.demo01.Singleton_01;


public class IvoryTowerTest extends SingletonTest<Singleton_01> {
    /**
     * final修饰属性 需要在构造方法中初始化
     */
    public IvoryTowerTest() {
        super(Singleton_01::getInstance);
    }
}
