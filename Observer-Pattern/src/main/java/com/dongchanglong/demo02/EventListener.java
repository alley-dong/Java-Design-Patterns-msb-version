package com.dongchanglong.demo02;

import com.dongchanglong.demo02.LotteryResult;

/**
 * 观察者（时间监听接口）
 * @date 2023/9/21 21:46
 * @author DongCL
 */
public interface EventListener {
    public void doEvent(LotteryResult lotteryResult);
}
