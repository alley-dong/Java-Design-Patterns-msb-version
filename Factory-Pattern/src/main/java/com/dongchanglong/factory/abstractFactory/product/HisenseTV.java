package com.dongchanglong.factory.abstractFactory.product;

/**
 * 具体产品-海信电视
 */
public class HisenseTV implements AbstractTV{
    @Override
    public String getDescription() {
        return "this is hisenseTv";
    }
}
