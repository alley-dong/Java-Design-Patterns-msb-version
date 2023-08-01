package com.dongchanglong.builder.demo01.director;

import com.dongchanglong.builder.demo01.builder.Builder;
import com.dongchanglong.builder.demo01.builder.MobikeBuilder;
import com.dongchanglong.builder.demo01.product.Bike;

/**
 * 指挥者
 * @date 2023/7/27 11:37
 * @author DongCL
 */
public class Director {

    private Builder builder;

    /**
     * 提供client调用 传入具体建造者
     */
    public Director(Builder builder){
        this.builder = builder;
    }

    /**
     * 自行车制作方法
     */
    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }


    public static void main(String[] args) {
        Director director = new Director(new MobikeBuilder());
        Bike construct = director.construct();
        System.out.println(construct.getFrame());
    }
}
