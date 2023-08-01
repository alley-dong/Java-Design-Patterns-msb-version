package com.dongchanglong.builder.demo01.product;

import lombok.Data;

/**
 * 产品-自行车
 * @date 2023/7/27 11:03
 * @author DongCL
 */
@Data
public class Bike {
    /**
     * 车架
     */
    private String frame;
    /**
     * 车座
     */
    private String seat;
}
