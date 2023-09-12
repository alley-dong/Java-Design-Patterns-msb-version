package com.dongchanglong.demo02;

/**
 * 实现化角色-支付模式接口
 * @date 2023/9/12 22:50
 * @author DongCL
 */
public interface IPayMode {
    //安全校验功能: 对各种支付模式进行风控校验
    boolean security(String uId);
}