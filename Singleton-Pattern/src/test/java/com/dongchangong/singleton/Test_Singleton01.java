package com.dongchangong.singleton;


import com.dongchanglong.singleton.demo03.Singleton_03;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
public class Test_Singleton01 {
    @Test
    public void test01() throws Exception{
        // 反射中，欲获取一个类或者调用某个类的方法，首先要获取到该类的Class 对象。
        Class<Singleton_03> singleton_03Class = Singleton_03.class;
        // getDeclaredXxx: 不受权限控制的获取类的成员.
        Constructor<Singleton_03> declaredConstructor = singleton_03Class.getDeclaredConstructor();
        // 设置可以访问私有对象
        declaredConstructor.setAccessible(true);
        // 通过构造方法 对对象进行实例化
        Singleton_03 instance = declaredConstructor.newInstance();
        Singleton_03 instance1 = declaredConstructor.newInstance();
        // false
        System.out.println(instance == instance1);
    }
}
