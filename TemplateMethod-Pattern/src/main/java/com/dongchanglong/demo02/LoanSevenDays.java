package com.dongchanglong.demo02;

/**
 * 借款七天
 * @date 2023/9/24 15:16
 * @author DongCL
 */
public class LoanSevenDays extends Accout{
    @Override
    public void calculate() {
        System.out.println("借款周期7天，无利息！ 仅收取服务费！");
    }

    @Override
    public void display() {
        System.out.println("七日借款无利息！");
    }
}
