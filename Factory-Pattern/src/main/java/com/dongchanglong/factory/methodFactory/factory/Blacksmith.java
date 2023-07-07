package com.dongchanglong.factory.methodFactory.factory;

import com.dongchanglong.factory.methodFactory.service.FactoryService;

/**
 *  铁匠 - 抽象工厂
 */
public interface Blacksmith {

    FactoryService getMethodInstance(WeaponType weaponType);
}
