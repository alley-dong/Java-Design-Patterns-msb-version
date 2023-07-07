package com.dongchanglong.factory.methodFactory.service.impl;

import com.dongchanglong.factory.methodFactory.entity.AwardInfo;
import com.dongchanglong.factory.methodFactory.entity.Result;
import com.dongchanglong.factory.methodFactory.service.FactoryService;

/**
 * 优惠券实现
 */
public class DiscountServiceImpl implements FactoryService {
    @Override
    public Result getInstance(AwardInfo awardInfo) {
        return new Result("200","discount");
    }
}
