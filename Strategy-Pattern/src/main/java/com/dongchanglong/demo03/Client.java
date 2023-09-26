package com.dongchanglong.demo03;

import com.dongchanglong.demo02.Receipt;
import com.dongchanglong.demo02.ReceiptBuilder;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Receipt> receiptList = ReceiptBuilder.getReceiptList();
        // 获取策略
        ReceiptHandleStrategyFactory.init();
        for (Receipt receipt : receiptList) {
            // 策略模式最主要的工作就是将策略的 定义、创建、使用这三部分 进行了解耦。
            ReceiptHandleStrategy strategy = ReceiptHandleStrategyFactory.getStrategy(receipt);
            // 执行策略
            strategy.receiptStrategy(receipt);
        }
    }
}
