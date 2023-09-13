package com.dongchanglong.demo01;

/**
 * TF卡实现类
 * @date 2023/9/13 22:39
 * @author DongCL
 */
public class TFCardImpl implements TFCard {

    @Override
    public String readTF() {

        String msg = "tf card reading data";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("tf card write data : " + msg);
    }
}

