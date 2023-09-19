package com.dongchanglong.demo02;


/**
 * File类，表示文件
 * @date 2023/9/19 21:51
 * @author DongCL
 */
public class File extends Entry {
    // 文件名
    private String name;
    // 文件大小
    private int size;
    public File(String name ,int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        return null;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
