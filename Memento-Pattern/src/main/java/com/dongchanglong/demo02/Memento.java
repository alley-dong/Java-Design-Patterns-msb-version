package com.dongchanglong.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * Memento 表示状态
 * @date 2023/11/6 20:48
 * @author DongCL
 */
public class Memento {

    int money;    //所持金钱
    ArrayList fruits; //获得的水果

    //构造函数
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    //获取当前玩家所有的金钱
    int getMoney() {
        return money;
    }

    //获取当前玩家所有的水果
    List getFruits() {
        return (List)fruits.clone();
    }

    //添加水果
    void addFruit(String fruit){
        fruits.add(fruit);
    }
}