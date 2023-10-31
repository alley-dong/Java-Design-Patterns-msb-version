package com.dongchanglong.demo01;

import java.util.ArrayList;

public class Test01 {

    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<>();
        objects.add("lisi");
        objects.add("zhangsan");
        objects.add("wangwu");
        Iterator<String> stringConcreteIterator = new ConcreteIterator<>(objects);
        while (stringConcreteIterator.hasNext()) {
            System.out.println(stringConcreteIterator.currentItem());
            stringConcreteIterator.next();
        }
        System.out.println("---------------------");
        // java 提供的迭代器
        java.util.Iterator<String> iterator = objects.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
