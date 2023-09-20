package com.dongchanglong.demo02;

import com.dongchanglong.demo01.ConcreteFlyweight;
import com.dongchanglong.demo01.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 *      生产五子棋的棋子
 */
public class GobangFactory {
    // 享元池
    private static Map<String, GobangFlyweight> pool;

    // 创建共享享元对象，设置对象的内部状态
    public GobangFactory() {
        pool = new HashMap<>();
        // 黑子
        pool.put("B",new BlackGobang());
        // 白子
        pool.put("W",new WriteGobang());
    }

    // 获取唯一享元工厂对象的方法
    public static GobangFactory getInstance(){
        return Singleton.INSTANCE;
    }

    // 静态内部类
    private static class Singleton{
        private static final GobangFactory INSTANCE = new GobangFactory();
    }

    // 通过key获取集合中的享元对象
    public GobangFlyweight getGobang(String key){
        return pool.get(key);
    }
}
