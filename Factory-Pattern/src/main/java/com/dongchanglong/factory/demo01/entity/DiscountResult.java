package com.dongchanglong.factory.demo01.entity;

import lombok.Data;

/**
 * 打折券操作响应结果封装类
 */
@Data
public class DiscountResult {

    /**
     * 状态码
     */
    private String status;

    /**
     * 信息
     */
    private String message;

    public DiscountResult(String status,String message){
        this.status = status;
        this.message = message;
    }
}