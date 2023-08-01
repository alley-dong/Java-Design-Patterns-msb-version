package com.dongchanglong.builder.demo01.builder;

import com.dongchanglong.builder.demo01.product.Bike;

/**
 * 摩拜单车建造者
 * @date 2023/7/27 11:33 
 * @author DongCL
 */
public class MobikeBuilder extends Builder{
    @Override
    public void buildFrame() {
        mBike.setFrame("摩拜单车 车架");
    }

    @Override
    public void buildSeat() {
        mBike.setFrame("摩拜单车 车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}
