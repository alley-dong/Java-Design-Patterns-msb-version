package com.dongchanglong.demo02;

import java.util.ArrayList;

/**
 * 容器对象，表示文件夹
 * @date 2023/9/19 21:57
 * @author DongCL
 */
public class Directory extends Entry{
    // 文件夹的名字
    private String name;
    // 文件夹和文件的集合
    private ArrayList<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    /**
     * 获取文件大小
     *      1.如果Entry是File类型的，则调用getSize方法 获取文件大小
     *      2.如果Entry是Directory类型，会继续调用子文件夹的getSize方法，形成递归调用。
     * @return
     */
    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry : directory) {
            entry.printList(prefix + "/" + name);
        }
    }
}
