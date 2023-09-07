package com.dongchanglong.decorator.demo02;

/**
 * App
 */
public class Client {
    public static void main(String[] args) {
        // 正常读写文件
        DataLoader dataLoader = new BaseFileDataLoader("demo.txt");

        // 读写文件并对文件加解密
        DataLoaderDecorator decorator  = new EncryptionDataDecorator(new BaseFileDataLoader("demo2.txt"));
    }
}
