package com.dongchanglong.factory.demo02.service.impl;

import com.dongchanglong.factory.demo02.entity.AwardInfo;
import com.dongchanglong.factory.demo02.entity.Result;
import com.dongchanglong.factory.demo02.service.FactoryService;

/**
 * 优惠券实现
 */
public class DiscountServiceImpl implements FactoryService {
    @Override
    public Result getInstance(AwardInfo awardInfo) {
        return new Result("200","discount");
    }
}
