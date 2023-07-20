package com.dongchanglong.factory.abstractFactory.product;

/**
 * 具体产品-海尔冰箱
 */
public class HairFreezer implements AbstractFreezer{
    @Override
    public String getDescription() {
        return "this is hairFreezer";
    }
}
