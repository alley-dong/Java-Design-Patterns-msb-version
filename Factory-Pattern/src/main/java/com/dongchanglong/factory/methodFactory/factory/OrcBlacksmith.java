package com.dongchanglong.factory.methodFactory.factory;

import com.dongchanglong.factory.methodFactory.service.FactoryService;
import com.dongchanglong.factory.methodFactory.service.impl.DiscountServiceImpl;
import com.dongchanglong.factory.methodFactory.service.impl.SmallGiftServiceImpl;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/**
 * 兽人铁匠 - 具体工厂
 */
public class OrcBlacksmith implements Blacksmith{

    private static final Map<Enum, FactoryService> ELFARSENAL = new HashMap<>();

    static {
        ELFARSENAL.put(WeaponType.ONE, new DiscountServiceImpl());
        ELFARSENAL.put(WeaponType.TWO, new SmallGiftServiceImpl());
    }

    @Override
    public FactoryService getMethodInstance(WeaponType weaponType) {
        return ELFARSENAL.get(weaponType);
    }
}
