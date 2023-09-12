package com.dongchanglong.demo02;

/**
 * 具体实现化角色 - 指纹支付及风控校验
 * @date 2023/9/12 22:51
 * @author DongCL
 */
public class PayFingerprintMode implements IPayMode {

    @Override
    public boolean security(String uId) {
        System.out.println("指纹支付,风控校验-指纹信息");
        return true;
    }
}