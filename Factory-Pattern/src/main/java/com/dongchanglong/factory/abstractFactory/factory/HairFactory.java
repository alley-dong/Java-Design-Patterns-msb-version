package com.dongchanglong.factory.abstractFactory.factory;

import com.dongchanglong.factory.abstractFactory.product.*;

/**
 * 具体工厂-hair工厂 只创建hair的产品族
 */
public class HairFactory implements AppliancesFactory{
    @Override
    public AbstractTV createTV() {
        return new HairTV();
    }

    @Override
    public AbstractFreezer createFreezer() {
        return new HairFreezer();
    }
}
