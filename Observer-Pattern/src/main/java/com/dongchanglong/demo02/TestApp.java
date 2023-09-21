package com.dongchanglong.demo02;

public class TestApp {
    public static void main(String[] args) {
        LotteryServiceImpl lotteryService = new LotteryServiceImpl();
        LotteryResult lotteryResult = lotteryService.lotteryAndMsg("2");
        System.out.println(lotteryResult);
    }
}
