package com.dongchanglong.demo03;

import com.dongchanglong.demo02.Receipt;

/**
 * MT4101策略实现
 * @date 2023/9/26 14:53
 * @author DongCL
 */
public class MT4101ReceiptHandleStrategy implements ReceiptHandleStrategy{
    @Override
    public void receiptStrategy(Receipt receipt) {
        System.out.println("MT4101接受信息");
    }
}
