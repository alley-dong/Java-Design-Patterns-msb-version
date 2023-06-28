package com.dongchanglong.factory.demo02.factory;

import com.dongchanglong.factory.demo02.service.FactoryService;

/**
 * 工厂类
 */
public class Factory {

    /**
     * 通过 枚举type 获取枚举类中的对象实例
     */
    public static FactoryService getAwardInfo(AwardType awardType){
        return awardType.getConstructor().get();
    }
}
