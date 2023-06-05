package com.dongchanglong.singleton.demo01;

/**
 * 单例模式-饿汉式
 * 在类加载期间初始化私有的静态示例，保证instance实例创建过程中是线程安全的( 实例在类加载时实例化，有JVM保证线程安全）。
 *
 * 特点：不支持延迟加载，获取实例速度比较快，但是如果对象比较大并且没有被使用 就会造成资源的浪费。
 */
public class Singleton_01 {

    /**
     * 私有构造方法，只有在当前类中可以实例化
     */
    private Singleton_01(){

    }

    /**
     * 在当前类中创建私有静态的全局对象
     */
    private static final Singleton_01 INSTANCE = new Singleton_01();

    /**
     * 提供全局访问点，供外部获取单例对象
     */
    public static Singleton_01 getInstance(){
        return INSTANCE;
    }
}
