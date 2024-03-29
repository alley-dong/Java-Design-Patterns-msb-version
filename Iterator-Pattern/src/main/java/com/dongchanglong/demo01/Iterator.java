package com.dongchanglong.demo01;

/**
 * 迭代器接口
 * @date 2023/10/31 21:14
 * @author DongCL
 */
public interface Iterator<E> {
    // 判断集合中是否有下一个元素
    boolean hasNext();

    // 将有游标后移一位
    void next();

    // 返回当前游标指定的元素
    E currentItem();
}
