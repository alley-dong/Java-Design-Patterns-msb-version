package com.dongchanglong.factory.methodFactory.service;

import com.dongchanglong.factory.methodFactory.entity.AwardInfo;
import com.dongchanglong.factory.methodFactory.entity.Result;

/**
 * 提供外部调用接口
 */
public interface FactoryService {

    Result getInstance(AwardInfo awardInfo);
}
