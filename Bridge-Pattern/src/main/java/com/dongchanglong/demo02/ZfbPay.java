package com.dongchanglong.demo02;

import java.math.BigDecimal;

/**
 * 支付渠道-支付宝划账(支付渠道实现-扩展抽象化角色)
 * @date 2023/9/12 22:54
 * @author DongCL
 */
public class ZfbPay extends Pay {

    public ZfbPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        System.out.println("支付宝渠道支付划账开始......");

        boolean security = payMode.security(uId);
        System.out.println("支付宝渠道支付风险校验: " + uId + " , " + tradeId +" , " + security);

        if(!security){
            System.out.println("支付宝渠道支付划账失败!");
            return "500";
        }
        System.out.println("支付宝渠道划账成功! 金额: "+ amount);
        return "200";
    }
}