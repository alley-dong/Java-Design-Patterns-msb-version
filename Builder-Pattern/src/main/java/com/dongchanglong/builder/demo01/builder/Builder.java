package com.dongchanglong.builder.demo01.builder;

import com.dongchanglong.builder.demo01.product.Bike;

/**
 * 抽象建造者 （可以是抽象类可以是接口）
 * @date 2023/7/27 11:05
 * @author DongCL
 */
public abstract class Builder {
    protected Bike mBike = new Bike();

    /**
     * 车架-提供子类重写
     */
    public abstract void buildFrame();
    /**
     * 车座-提供子类重写
     */
    public abstract void buildSeat();
    /**
     * 创建自行车-提供子类重写
     */
    public abstract Bike createBike();
}
