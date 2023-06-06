package com.dongchanglong.singleton.demo03;

/**
 * 单例模式-静态内部类
 * 特点：支持延迟加载、线程安全
 */
public class Singleton_03 {

    /**
     * 私有构造方法，只有在当前类中可以实例化
     */
    private Singleton_03() {
        if (SingletonHandler.INSTANCE != null){
            throw new RuntimeException("不允许非法访问!");
        }
    }

    /**
     * 创建匿名内部类，在当前类中创建私有静态的全局对象
     */
    private static class SingletonHandler {
        /**
         * 在匿名内部类中创建单例对象，只有装在内部类的时候才会创建对象，线程安全是通过jvm实现的
         */
        private static final Singleton_03 INSTANCE = new Singleton_03();
    }

    /**
     * 提供全局访问点，供外部获取单例对象
     */
    public static Singleton_03 getInstance() {
        return SingletonHandler.INSTANCE;
    }
}
