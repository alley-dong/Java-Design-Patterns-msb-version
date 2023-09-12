package com.dongchanglong.demo01;

import java.math.BigDecimal;

//测试
public class Test_Pay {

    public static void main(String[] args) {
        PayController payController = new PayController();
        System.out.println("测试: 微信支付、人脸支付方式");
        payController.doPay("weixin_001", "1000112333333", new BigDecimal(100), 1, 2);

        System.out.println("\n测试: 支付宝支付、指纹支付方式");
        payController.doPay("hifubao_002", "1000112334567", new BigDecimal(100), 2, 3);
    }
}