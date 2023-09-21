package com.dongchanglong.demo02;

/**
 * 买房摇号
 * @date 2023/9/21 21:26 
 * @author DongCL
 */
public class DrawHouseService {

    // 摇号
    public String lots(String uId){
        if (uId.hashCode()%2==0){
            return "您中奖了";
        }else {
            return "您未中奖";
        }
    }
}
