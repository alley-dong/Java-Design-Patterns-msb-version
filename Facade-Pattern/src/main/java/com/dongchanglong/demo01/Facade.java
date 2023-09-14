package com.dongchanglong.demo01;

/**
 * 外观角色-外观类
 * @date 2023/9/14 21:19
 * @author DongCL
 */
public class Facade {
    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    private SubSystemC subSystemC = new SubSystemC();

    public void method(){
        subSystemA.methodA();
        subSystemB.methodB();
        subSystemC.methodC();
    }
}
