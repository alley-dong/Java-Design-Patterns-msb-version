package com.dongchanglong.demo02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 事件处理类
 * @date 2023/9/21 21:54
 * @author DongCL
 */
public class EventManager {
    public enum EventType{
        MQ,Message
    }
    // 监听器集合
    private Map<Enum<EventType>, List<EventListener>> listenerMap = new HashMap<>();

    public EventManager(Enum<EventType>... operations){
        for (Enum<EventType> operation : operations) {
            this.listenerMap.put(operation,new ArrayList<>());
        }
    }

    /**
     * 订阅
     * @param eventType 事件类型
     * @param listener 监听对象
     */
    public void subscribe(Enum<EventType> eventType,EventListener listener){
        List<EventListener> eventListeners = listenerMap.get(eventType);
        eventListeners.add(listener);
    }

    /**
     * 取消订阅
     * @param eventType 事件类型
     * @param listener 监听对象
     */
    public void unSubscribe(Enum<EventType> eventType,EventListener listener){
        List<EventListener> eventListeners = listenerMap.get(eventType);
        eventListeners.remove(listener);
    }

    /**
     * 通知
     * @param eventType 事件类型
     * @param lotteryResult 结果
     */
    public void notify(Enum<EventType> eventType, LotteryResult lotteryResult){
        List<EventListener> eventListeners = listenerMap.get(eventType);
        for (EventListener eventListener : eventListeners) {
            eventListener.doEvent(lotteryResult);
        }
    }
}
