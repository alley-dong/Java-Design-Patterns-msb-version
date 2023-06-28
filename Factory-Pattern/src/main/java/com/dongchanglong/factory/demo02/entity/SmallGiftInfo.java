package com.dongchanglong.factory.demo02.entity;

import lombok.Data;

/**
 * 小礼品信息对应实体类
 */
@Data
public class SmallGiftInfo {

    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 用户手机
     */
    private String userPhone;
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 收货地址
     */
    private String relAddress;
    
}