package com.dongchanglong.demo02;

import com.dongchanglong.demo01.*;

public class Client {

    public static void main(String[] args) {

        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.read(sdCard));

        System.out.println("========================");
        TFCard tfCard = new TFCardImpl();
        SDAdapterTF adapterTF = new SDAdapterTF(tfCard);
        System.out.println(computer.read(adapterTF));
    }
}