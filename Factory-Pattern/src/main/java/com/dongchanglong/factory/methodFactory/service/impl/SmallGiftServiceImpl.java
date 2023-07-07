package com.dongchanglong.factory.methodFactory.service.impl;

import com.dongchanglong.factory.methodFactory.entity.AwardInfo;
import com.dongchanglong.factory.methodFactory.entity.Result;
import com.dongchanglong.factory.methodFactory.service.FactoryService;

/**
 * 小礼品实现
 */
public class SmallGiftServiceImpl implements FactoryService {
    @Override
    public Result getInstance(AwardInfo awardInfo) {
        return new Result("200","smallGift");
    }
}
