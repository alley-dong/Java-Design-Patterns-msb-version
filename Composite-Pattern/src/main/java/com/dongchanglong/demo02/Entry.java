package com.dongchanglong.demo02;

/**
 * Entry 抽象类（文件夹+文件）
 * @date 2023/9/19 21:47
 * @author DongCL
 */
public abstract class Entry {
    // 获取文件名
    public abstract String getName();
    // 获取文件大小
    public abstract int getSize();
    // 添加文件或者文件夹方法
    public abstract Entry add(Entry entry);
    // 显示制定目录下的所有文件信息
    public abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
