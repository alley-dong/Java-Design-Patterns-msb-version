package com.dongchanglong.factory.abstractFactory.product;

/**
 * 具体产品-海信冰箱
 */
public class HisenseFreezer implements AbstractFreezer{
    @Override
    public String getDescription() {
        return "this is hisenseFreezer";
    }
}
