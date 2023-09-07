package com.dongchanglong.decorator.demo02;

/**
 * 抽象装饰者类
 */
public class DataLoaderDecorator implements DataLoader{

    private DataLoader dataLoader;
    public DataLoaderDecorator(DataLoader dataLoader){
        this.dataLoader = dataLoader;
    }

    @Override
    public String read() {
        return dataLoader.read();
    }

    @Override
    public void write(String data) {
        dataLoader.write(data);
    }
}
