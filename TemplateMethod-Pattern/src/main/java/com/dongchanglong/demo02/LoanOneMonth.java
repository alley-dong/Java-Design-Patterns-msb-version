package com.dongchanglong.demo02;

/**
 * 借款一个月
 * @date 2023/9/24 15:16
 * @author DongCL
 */
public class LoanOneMonth extends Accout{
    @Override
    public void calculate() {
        System.out.println("借款周期一个月，有利息！ 利息为总额10%！");
    }
}
