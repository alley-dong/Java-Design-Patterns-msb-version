package com.dongchanglong.factory.demo01.service;

import com.alibaba.fastjson.JSON;
import com.dongchanglong.factory.demo01.entity.SmallGiftInfo;

/**
 * 礼品服务
 */
public class SmallGiftService {

    public Boolean giveSmallGift(SmallGiftInfo smallGiftInfo){
        System.out.println("小礼品已发货,获奖用户注意查收! " + JSON.toJSON(smallGiftInfo));
        return true;
    }
}