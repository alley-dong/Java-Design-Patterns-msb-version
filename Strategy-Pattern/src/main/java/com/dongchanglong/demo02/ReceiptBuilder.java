package com.dongchanglong.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * 回执信息构建
 * @date 2023/9/26 14:48
 * @author DongCL
 */
public class ReceiptBuilder {

    // 回执信息列表
    public static List<Receipt> getReceiptList(){
        List<Receipt> list = new ArrayList<>();
        list.add(new Receipt("MT1101回执信息","MT1101"));
        list.add(new Receipt("MT2101回执信息","MT2101"));
        list.add(new Receipt("MT4101回执信息","MT4101"));
//        list.add(new Receipt("MT8101回执信息","MT8101"));
        return list;
    }
}
