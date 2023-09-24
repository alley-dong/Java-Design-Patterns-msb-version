package com.dongchanglong.demo01;

/**
 * 模版抽象类
 * @date 2023/9/24 14:42
 * @author DongCL
 */
public abstract class AbstractClassTemplate {

    void step1(String key){
        System.out.println("在模版类中 -> 执行步骤1");
        if (step2(key)){
            step3();
        }else {
            step4();
        }

        step5();
    }

    boolean step2(String key){
        System.out.println("在模版类中 -> 执行步骤2");
        if ("x".equals(key)){
            return true;
        }
        return false;
    }

    // 扩展
    abstract void step3();
    abstract void step4();

    void step5(){
        System.out.println("在模版类中 -> 执行步骤5");
    }

    // 模版方法 对模版类中的方法进行调用
    void run(String key){
        step1(key);
    }

}
