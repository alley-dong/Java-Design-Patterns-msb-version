package com.dongchanglong.demo02;

import com.dongchanglong.demo01.SDCard;
import com.dongchanglong.demo01.TFCard;

/**
 * 定义适配器类(SD兼容TF)(对象-组合)
 * @date 2023/9/13 22:52
 * @author DongCL
 */
public class SDAdapterTF implements SDCard {

    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card ");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}