package com.dongchanglong.demo02;

/**
 * 外观类-智能音箱
 * @date 2023/9/14 21:25
 * @author DongCL
 */
public class SmartApplicationFacade {

    private Light light;
    private Tv tv;
    private AirCondition airCondition;

    public SmartApplicationFacade(){
        this.light = new Light();
        this.tv = new Tv();
        this.airCondition = new AirCondition();
    }

    public void say(String message){
        if (message.contains("打开")){
            on();
        }else if (message.contains("关闭")){
            off();
        }else {
            System.out.println("对不起 滚！");
        }
    }

    private void off() {
        System.out.println("睡觉 关闭电器");
        light.off();
        tv.off();
        airCondition.off();
    }

    private void on() {
        System.out.println("起床 开启电器");
        light.on();
        tv.on();
        airCondition.on();
    }

}
