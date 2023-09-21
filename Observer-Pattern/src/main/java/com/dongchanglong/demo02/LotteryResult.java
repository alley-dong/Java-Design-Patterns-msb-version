package com.dongchanglong.demo02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 开奖结果封装类
 * @date 2023/9/21 21:30
 * @author DongCL
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LotteryResult {
    private String uId; // 用户ID
    private String msg; // 摇号信息
    private Date dateTime; // 时间
}
