package com.dongchanglong.demo01;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * 具体的迭代器
 * @date 2023/10/31 21:17
 * @author DongCL
 */
public class ConcreteIterator<E> implements Iterator<E>{
    // 游标
    private int cursor;
    // 容器
    private ArrayList<E> arrayList;

    public ConcreteIterator(ArrayList<E> arrayList) {
        this.cursor = 0;
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {
        return cursor != arrayList.size();
    }

    @Override
    public void next() {
        cursor++;
    }

    @Override
    public E currentItem() {
        if (cursor >= arrayList.size()){
            throw new NoSuchElementException();
        }
        return arrayList.get(cursor);
    }
}
