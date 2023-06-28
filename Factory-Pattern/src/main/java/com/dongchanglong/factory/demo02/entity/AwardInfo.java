package com.dongchanglong.factory.demo02.entity;

import lombok.Data;

import java.util.Map;

/**
 * 获奖信息对应实体类
 */
@Data
public class AwardInfo {
    /**
     * 用户唯一ID
     */
    private String uid;

    /**
     * 奖品类型: 1 打折券 ,2 优酷会员,3 小礼品
     */
    private Integer awardType;

    /**
     * 奖品编号
     */
    private String awardNumber;

    /**
     * 额外信息
     */
    Map<String, String> extMap;
}

