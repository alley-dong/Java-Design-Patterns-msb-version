package com.dongchanglong.factory.demo02.service;

import com.dongchanglong.factory.demo02.entity.AwardInfo;
import com.dongchanglong.factory.demo02.entity.Result;

/**
 * 提供外部调用接口
 */
public interface FactoryService {

    Result getInstance(AwardInfo awardInfo);
}
