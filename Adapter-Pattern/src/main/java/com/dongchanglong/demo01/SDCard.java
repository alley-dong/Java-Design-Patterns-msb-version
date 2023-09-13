package com.dongchanglong.demo01;

/**
 * SD卡接口
 * @date 2023/9/13 22:39
 * @author DongCL
 */
public interface SDCard {

    //读取SD卡方法
    String readSD();
    //写入SD卡功能
    void writeSD(String msg);
}