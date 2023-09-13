package com.dongchanglong.demo01;

/**
 * SD卡实现类
 * @date 2023/9/13 22:39
 * @author DongCL
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "sd card reading data";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("sd card write data : " + msg);
    }
}