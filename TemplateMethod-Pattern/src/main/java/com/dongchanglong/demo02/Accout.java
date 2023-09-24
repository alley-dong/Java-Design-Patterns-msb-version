package com.dongchanglong.demo02;

/**
 * 模版方法
 * @date 2023/9/24 15:39
 * @author DongCL
 */
public abstract class Accout {

    // step1 验证用户信息
    public boolean validate(String account,String password){
        System.out.println("账号：" + account + ",密码：" + password);
        if (account.equalsIgnoreCase("tom") && password.equalsIgnoreCase("123")){
            return true;
        }else {
            return false;
        }
    }

    // step2 抽象方法-计划利息
    public abstract void calculate();

    // step3 具体方法-显示利息
    public void display(){
        System.out.println("显示利息！");
    }

    // 模版方法
    public void handle(String account,String password){
        if (!validate(account,password)){
            System.out.println("账户或密码错误！");
            return;
        }

        calculate();
        display();
    }
}
