package com.dongchanglong.demo01;

import com.dongchanglong.demo02.Acceptable;

import java.time.LocalDate;

/**
 * 水果类
 **/
public class Fruit extends Product implements Acceptable {
    //重量
    private float weight;
    public Fruit(String name, LocalDate producedDate, double price, float weight) {
        super(name, producedDate, price);
        this.weight = weight;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}