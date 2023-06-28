package com.dongchanglong.factory.demo01.service;

import com.dongchanglong.factory.demo01.entity.Result;

/**
 * 打折券服务
 */
public class DiscountService {

    public Result sendDiscount(String uid, String number){
        System.out.println("向用户发放打折券一张: " + uid + " , " + number);
        return new Result("200","发放打折券成功");
    }
}