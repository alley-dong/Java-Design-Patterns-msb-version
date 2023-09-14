package com.dongchanglong.demo02;

public class Client {


    public static void main(String[] args) {
        // 创建外观对象
        SmartApplicationFacade facade = new SmartApplicationFacade();
        facade.say("打开");
        facade.say("关闭");
    }
}
