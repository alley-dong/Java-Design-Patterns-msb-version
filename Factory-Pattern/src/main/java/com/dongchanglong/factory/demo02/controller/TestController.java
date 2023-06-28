package com.dongchanglong.factory.demo02.controller;

import com.dongchanglong.factory.demo02.entity.AwardInfo;
import com.dongchanglong.factory.demo02.entity.Result;
import com.dongchanglong.factory.demo02.factory.AwardType;
import com.dongchanglong.factory.demo02.factory.Factory;
import com.dongchanglong.factory.demo02.service.FactoryService;

/**
 * 简单工厂模式 （对产品的层级 划分）
 */
public class TestController {
    public void test(){
        FactoryService awardInfo = Factory.getAwardInfo(AwardType.DISCOUNT);
        Result instance = awardInfo.getInstance(new AwardInfo());
    }
}
