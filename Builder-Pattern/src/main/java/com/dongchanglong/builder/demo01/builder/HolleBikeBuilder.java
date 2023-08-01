package com.dongchanglong.builder.demo01.builder;

import com.dongchanglong.builder.demo01.product.Bike;

/**
 * 哈啰单车建造者
 * @date 2023/7/27 11:35
 * @author DongCL
 */
public class HolleBikeBuilder extends Builder{
    @Override
    public void buildFrame() {
        mBike.setFrame("哈啰单车 车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("哈啰单车 车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}
