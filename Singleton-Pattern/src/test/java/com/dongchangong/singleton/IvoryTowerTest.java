package com.dongchangong.singleton;

import com.dongchanglong.singleton.demo01.Singleton_01;


/**
 * 饿汉式 测试类
 */
public class IvoryTowerTest extends SingletonTest<Singleton_01> {
    /**
     * final修饰属性 需要在构造方法中初始化
     *
     * 子类的初始化过程包括调用父类的构造方法、分配内存空间、初始化父类的成员变量和代码块、
     * 初始化子类的成员变量和代码块，最后执行子类的构造方法。这样，子类对象就完成了初始化，
     * 并可以使用父类和子类的属性和方法
     */
    public IvoryTowerTest() {
        super(Singleton_01::getInstance);
    }
}
