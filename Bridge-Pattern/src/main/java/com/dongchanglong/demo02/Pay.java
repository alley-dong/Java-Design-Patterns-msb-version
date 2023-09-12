package com.dongchanglong.demo02;

import java.math.BigDecimal;

/**
 * 抽象化角色 - 支付抽象类
 * @date 2023/9/12 22:52
 * @author DongCL
 */
public abstract class Pay {
    //桥接对象
    protected IPayMode payMode;
    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    //划账功能
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}