package com.dongchanglong.decorator.demo02;

/**
 * 具体装饰者类
 */
public class EncryptionDataDecorator extends DataLoaderDecorator{
    public EncryptionDataDecorator(DataLoader dataLoader) {
        super(dataLoader);
    }

    @Override
    public String read() {
        // 对文件解密
        return decode(super.read());
    }

    @Override
    public void write(String data) {
        // 对文件加密
        super.write(encode(data));
    }

    // 加密操作
    public String encode(String data){
        // 此处省略了对文件加密的操作.......
        return "";
    }

    // 解密操作
    public String decode(String data){
        // 此处省略了对文件解密的操作.......
        return "";
    }
}
