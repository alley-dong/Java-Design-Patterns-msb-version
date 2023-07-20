package com.dongchanglong.factory.abstractFactory.factory;

import com.dongchanglong.factory.abstractFactory.product.AbstractFreezer;
import com.dongchanglong.factory.abstractFactory.product.AbstractTV;

/**
 * 抽象工厂-在一个抽象工厂中可以声明多个工厂方法 用来创建不同类型的产品
 */
public interface AppliancesFactory {

    AbstractTV createTV();
    AbstractFreezer createFreezer();
}
