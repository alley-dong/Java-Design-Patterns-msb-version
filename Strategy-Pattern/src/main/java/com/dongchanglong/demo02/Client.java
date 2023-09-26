package com.dongchanglong.demo02;

import java.util.List;

/**
 * 没有设计模式的写法
 * @date 2023/9/26 14:50
 * @author DongCL
 */
public class Client {
    public static void main(String[] args) {
        List<Receipt> receiptList = ReceiptBuilder.getReceiptList();
        for (Receipt receipt : receiptList) {
            if ("MT1011".equalsIgnoreCase(receipt.getType())){
                System.out.println("接受MT1011的回执信息");
            }else if ("MT2011".equalsIgnoreCase(receipt.getType())){
                System.out.println("接受MT1211的回执信息");
            }else if ("MT4011".equalsIgnoreCase(receipt.getType())){
                System.out.println("接受MT4011的回执信息");
            }else if ("MT8011".equalsIgnoreCase(receipt.getType())){
                System.out.println("接受MT8011的回执信息");
            }
        }
    }
}
