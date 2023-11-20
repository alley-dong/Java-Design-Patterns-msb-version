package com.dongchanglong.demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单类
 * @date 2023/11/6 21:01
 * @author DongCL
 */
public class Order {

    private int diningTable;  //餐桌号码

    //存储菜名与份数
    private Map<String,Integer> foodMenu = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }
    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodMenu() {
        return foodMenu;
    }
    public void setFoodDic(Map<String, Integer> foodMenu) {
        this.foodMenu = foodMenu;
    }
}

