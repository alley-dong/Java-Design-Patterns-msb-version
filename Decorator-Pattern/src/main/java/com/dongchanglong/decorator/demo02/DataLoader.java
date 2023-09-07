package com.dongchanglong.decorator.demo02;

/**
 * 抽象的文件读取接口
 */
public interface DataLoader {
    String read();
    void write(String data);
}
