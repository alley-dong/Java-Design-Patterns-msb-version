package com.dongchanglong.factory.abstractFactory.factory;

import com.dongchanglong.factory.abstractFactory.product.*;

/**
 * 具体工厂-hisense工厂 只创建hisense的产品族
 */
public class HisenseFactory implements AppliancesFactory{
    @Override
    public AbstractTV createTV() {
        return new HisenseTV();
    }

    @Override
    public AbstractFreezer createFreezer() {
        return new HisenseFreezer();
    }
}
