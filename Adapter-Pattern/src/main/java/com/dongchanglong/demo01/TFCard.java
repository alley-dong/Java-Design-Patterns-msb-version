package com.dongchanglong.demo01;

/**
 * TF卡接口
 * @date 2023/9/13 22:39
 * @author DongCL
 */
public interface TFCard {

    //读取TF卡方法
    String readTF();
    //写入TF卡功能
    void writeTF(String msg);
}