package com.dongchanglong.factory.simpleFactory.entity;

import lombok.Data;

/**
 * 操作响应结果封装类
 */
@Data
public class Result {

    /**
     * 状态码
     */
    private String status;

    /**
     * 信息
     */
    private String message;

    public Result(String status, String message){
        this.status = status;
        this.message = message;
    }
}