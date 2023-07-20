package com.dongchanglong.factory.abstractFactory.product;

/**
 * 具体产品-海尔电视
 */
public class HairTV implements AbstractTV{
    @Override
    public String getDescription() {
        return "this is hairTv";
    }
}
