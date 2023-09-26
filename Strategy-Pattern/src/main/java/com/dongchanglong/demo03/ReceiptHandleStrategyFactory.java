package com.dongchanglong.demo03;

import com.dongchanglong.demo02.Receipt;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略工厂类
 * @date 2023/9/26 14:58
 * @author DongCL
 */
public class ReceiptHandleStrategyFactory {

    // 使用Map集合存储策略信息，彻底消除if...else
    private static Map<String,ReceiptHandleStrategy> strategyMap;

    // 在调用init方法的时候在进行初始化  比静态代码块更好一些
    public static void init(){
        strategyMap = new HashMap<>();
        strategyMap.put("MT1101",new MT1101ReceiptHandleStrategy());
        strategyMap.put("MT2101",new MT2101ReceiptHandleStrategy());
        strategyMap.put("MT4101",new MT4101ReceiptHandleStrategy());
    }

    // 根据回执类型，获取对应的策略对象
    public static ReceiptHandleStrategy getStrategy(Receipt receipt){
        return strategyMap.get(receipt.getType());
    }
}
