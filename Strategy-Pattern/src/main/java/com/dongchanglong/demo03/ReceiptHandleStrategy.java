package com.dongchanglong.demo03;

import com.dongchanglong.demo02.Receipt;

/**
 * 回执处理策略接口
 * @date 2023/9/26 14:51
 * @author DongCL
 */
public interface ReceiptHandleStrategy {
    // 策略接口
    void receiptStrategy(Receipt receipt);
}
