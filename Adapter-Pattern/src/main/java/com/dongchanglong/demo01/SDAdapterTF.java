package com.dongchanglong.demo01;

/**
 * 定义适配器类(SD兼容TF)(类适配-继承)
 * @date 2023/9/13 22:40
 * @author DongCL
 */
public class SDAdapterTF extends  TFCardImpl implements SDCard{

    @Override
    public String readSD() {
        System.out.println("adapter read tf card ");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}