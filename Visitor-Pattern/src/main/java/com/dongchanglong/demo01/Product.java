package com.dongchanglong.demo01;

import lombok.Data;

import java.time.LocalDate;

/**
 * 抽象商品父类
 **/
@Data
public abstract class Product {
    private String name;  //商品名
    private LocalDate producedDate;  // 生产日期
    private double price;  //单品价格

    public Product(String name, LocalDate producedDate, double price) {
        this.name = name;
        this.producedDate = producedDate;
        this.price = price;
    }
}