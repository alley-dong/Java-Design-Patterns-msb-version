package com.dongchanglong.demo01;

import com.dongchanglong.demo02.Acceptable;

import java.time.LocalDate;

/**
 * 酒水类
 **/
public class Wine extends Product implements Acceptable {
    public Wine(String name, LocalDate producedDate, double price) {
        super(name, producedDate, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}