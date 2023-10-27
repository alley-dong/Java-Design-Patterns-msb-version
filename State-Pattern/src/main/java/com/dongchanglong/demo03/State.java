package com.dongchanglong.demo03;

/**
 * 交通灯状态接口
 */
public interface State {
    // 切换绿灯
    void switchToGreen(TrafficLight trafficLight);
    // 切换红灯
    void switchToRed(TrafficLight trafficLight);
    // 切换黄灯
    void switchToYellow(TrafficLight trafficLight);
}
