package com.dongchangong.singleton;


import com.dongchanglong.singleton.demo01.Singleton_01;
import org.junit.Test;

public class Test_Singleton {

    @Test
    public void test01(){

        Singleton_01 instance = Singleton_01.getInstance();
        Singleton_01 instance1 = Singleton_01.getInstance();
        System.out.println(instance == instance1);
    }
}
