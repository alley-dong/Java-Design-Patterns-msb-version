package com.dongchanglong.demo02;

import java.util.Date;

/**
 * 
 * @date 2023/9/21 21:32
 * @author DongCL
 */
public class LotteryServiceImpl extends LotteryService{
    private DrawHouseService drawHouseService = new DrawHouseService();

    @Override
    public LotteryResult lottery(String uId) {
        // 1.摇号
        String lots = drawHouseService.lots(uId);
        return new LotteryResult(uId,lots,new Date());
    }
}
