package com.dongchanglong.demo02;

/**
 * 开奖服务接口
 * @date 2023/9/21 21:29
 * @author DongCL
 */
public abstract class LotteryService {

    private EventManager eventManager;

    public LotteryService() {
        // 设置事件类型
        eventManager = new EventManager(EventManager.EventType.Message,EventManager.EventType.MQ);
        // 订阅
        eventManager.subscribe(EventManager.EventType.Message,new MessageEventListenerImpl());
        eventManager.subscribe(EventManager.EventType.MQ,new MQEventListenerImpl());
    }

    public LotteryResult lotteryAndMsg(String uId){
        LotteryResult lottery = lottery(uId);
        // 发送通知
        eventManager.notify(EventManager.EventType.Message,lottery);
        eventManager.notify(EventManager.EventType.MQ,lottery);
        return lottery;
    }

    public abstract LotteryResult lottery(String uId);
}
