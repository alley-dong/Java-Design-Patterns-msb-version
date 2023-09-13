package com.dongchanglong.demo01;

/**
 * 电脑类
 * @date 2023/9/13 22:42
 * @author DongCL
 */
public class Computer {

    public String read(SDCard sdCard){
        return sdCard.readSD();
    }
}
