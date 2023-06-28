package com.dongchanglong.factory.simpleFactory.service.impl;

import com.dongchanglong.factory.simpleFactory.entity.AwardInfo;
import com.dongchanglong.factory.simpleFactory.entity.Result;
import com.dongchanglong.factory.simpleFactory.service.FactoryService;

/**
 * 小礼品实现
 */
public class SmallGiftServiceImpl implements FactoryService {
    @Override
    public Result getInstance(AwardInfo awardInfo) {
        return new Result("200","smallGift");
    }
}
