package com.dongchanglong.factory.demo02.service.impl;

import com.dongchanglong.factory.demo02.entity.AwardInfo;
import com.dongchanglong.factory.demo02.entity.Result;
import com.dongchanglong.factory.demo02.service.FactoryService;

/**
 * 小礼品实现
 */
public class SmallGiftServiceImpl implements FactoryService {
    @Override
    public Result getInstance(AwardInfo awardInfo) {
        return new Result("200","smallGift");
    }
}
