package com.dongchanglong.demo01;

/**
 * 上下文类：策略模式的本质就是通过Context类作为控制单元，对不同的策略进行调度分配
 * @date 2023/9/26 14:34
 * @author DongCL
 */
public class Context {

    // 维持一个抽象策略的引用
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void al(){
        strategy.algorithm();
    }
}
