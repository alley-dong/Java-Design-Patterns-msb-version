package com.dongchanglong.demo02;

/**
 * 抽象迭代器
 * @date 2023/10/31 21:32
 * @author DongCL
 */
public interface IteratorIterator<E> {
    // 重置为第一个元素
    void reset();
    // 获取下一个元素
    E next();
    // 检索当前元素
    E currentItem();
    // 判断集合中是否有下一个元素
    boolean hasNext();
}
