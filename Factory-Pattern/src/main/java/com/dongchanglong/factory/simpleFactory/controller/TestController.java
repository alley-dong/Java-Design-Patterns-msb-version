package com.dongchanglong.factory.simpleFactory.controller;

import com.dongchanglong.factory.simpleFactory.entity.AwardInfo;
import com.dongchanglong.factory.simpleFactory.entity.Result;
import com.dongchanglong.factory.simpleFactory.factory.AwardType;
import com.dongchanglong.factory.simpleFactory.factory.Factory;
import com.dongchanglong.factory.simpleFactory.service.FactoryService;

/**
 * 简单工厂模式 （对产品的层级 划分）
 */
public class TestController {
    public void test(){
        FactoryService awardInfo = Factory.getAwardInfo(AwardType.DISCOUNT);
        Result instance = awardInfo.getInstance(new AwardInfo());
    }
}
