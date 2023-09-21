package com.dongchanglong.demo02;

/**
 * MQ发送时间监听类
 */
public class MQEventListenerImpl implements EventListener {
    @Override
    public void doEvent(LotteryResult lotteryResult) {
        System.out.println("发送MQ通知 用户ID："+ lotteryResult.getUId() + "：" + lotteryResult.getMsg());
    }
}
