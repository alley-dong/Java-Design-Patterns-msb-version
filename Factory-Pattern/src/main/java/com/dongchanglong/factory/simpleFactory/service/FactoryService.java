package com.dongchanglong.factory.simpleFactory.service;

import com.dongchanglong.factory.simpleFactory.entity.AwardInfo;
import com.dongchanglong.factory.simpleFactory.entity.Result;

/**
 * 提供外部调用接口
 */
public interface FactoryService {

    Result getInstance(AwardInfo awardInfo);
}
