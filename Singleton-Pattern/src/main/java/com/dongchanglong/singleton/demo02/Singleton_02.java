package com.dongchanglong.singleton.demo02;

/**
 * 单例模式-懒汉式
 * 首先懒汉模式是线程不安全的，在并发的情况会出现创建个多个单例对象的问题
 * 方案一： 试用synchronized锁 锁住创建单例对象的方法。
 * 缺点：因为对getInstance()方法加了锁，导致这个方法的并发度很低。
 *
 * 方案二： 双重校验 + volatile
 *
 * 特点：支持延迟加载，只有调用getInstance方法时，才会创建对象。
 */
public class Singleton_02 {

    /**
     * 私有构造方法，只有在当前类中可以实例化
     */
    private Singleton_02(){

    }

    /**
     * 在当前类中创建私有静态的全局对象
     *
     * 使用volatile保证变量可见性么，屏蔽指令重排序。
     */
    private volatile static Singleton_02 INSTANCE;

    /**
     * 提供全局访问点，供外部获取单例对象
     * 判断对象是否呗初始化，来选择是否创建对象
     */
    public static Singleton_02 getInstance(){
        // 判断是否创建过
        if(INSTANCE == null){
            synchronized (Singleton_02.class){
                //抢到锁之后再次进行判断是否为null
                if(INSTANCE == null){
                    INSTANCE = new Singleton_02();
                }
            }
        }
        return INSTANCE;
    }
}
