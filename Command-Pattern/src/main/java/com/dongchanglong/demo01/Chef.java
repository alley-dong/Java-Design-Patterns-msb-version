
package com.dongchanglong.demo01;

/**
 * 厨师类 -> Receiver角色
 * @date 2023/11/6 21:02
 * @author DongCL
 */
public class Chef {
    public void makeFood(int num,String foodName){
        System.out.println(num + "份," + foodName);
    }
}

