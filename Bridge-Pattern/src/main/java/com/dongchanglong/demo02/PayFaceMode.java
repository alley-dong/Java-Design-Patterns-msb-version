package com.dongchanglong.demo02;

/**
 * 具体实现化角色 - 刷脸支付及风控校验
 * @date 2023/9/12 22:51
 * @author DongCL
 */
public class PayFaceMode implements IPayMode {

    @Override
    public boolean security(String uId) {
        System.out.println("人脸支付,风控校验-脸部识别");
        return true;
    }
}