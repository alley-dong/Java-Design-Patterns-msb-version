package com.dongchanglong.demo02;

/**
 * 短信发送时间监听类
 */
public class MessageEventListenerImpl implements EventListener {
    @Override
    public void doEvent(LotteryResult lotteryResult) {
        System.out.println("发送短信通知 用户ID："+ lotteryResult.getUId() + "：" + lotteryResult.getMsg());
    }
}
