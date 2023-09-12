package com.dongchanglong.demo02;

/**
 * 具体实现化角色 - 密码支付及风控校验
 * @date 2023/9/12 22:51
 * @author DongCL
 */
public class PayCypher implements IPayMode {

    @Override
    public boolean security(String uId) {
        System.out.println("密码支付,风控校验-环境安全");
        return false;
    }
}