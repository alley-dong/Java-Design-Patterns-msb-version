package com.dongchanglong.factory.simpleFactory.service.impl;

import com.dongchanglong.factory.simpleFactory.entity.AwardInfo;
import com.dongchanglong.factory.simpleFactory.entity.Result;
import com.dongchanglong.factory.simpleFactory.service.FactoryService;

/**
 * 优惠券实现
 */
public class DiscountServiceImpl implements FactoryService {
    @Override
    public Result getInstance(AwardInfo awardInfo) {
        return new Result("200","discount");
    }
}
