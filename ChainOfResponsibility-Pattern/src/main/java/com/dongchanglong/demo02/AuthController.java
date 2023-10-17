package com.dongchanglong.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AuthController {

    /**
     * 审核方法
     * @param name 申请人姓名
     * @param orderId 申请单ID
     * @param authDate 申请时间
     * @return
     */
    public AuthInfo doAuth(String name , String orderId, Date authDate) throws ParseException {
        Date date = null;

        // 三级审批
        // 查询是否存在审核信息，虚拟三级审核人ID：1000013
        date = AuthService.queryAuthInfo("1000013", orderId);
        if (date == null) {
            return new AuthInfo("0001","单号：" + orderId,"状态：等待三级审核负责人进行审批");
        }

        // 二级审批
        // 查询是否存在审核信息，虚拟二级审核人ID：1000012
        // 耳机审核人审核申请单的时间范围: 10-31 ~ 11-11
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (authDate.after(simpleDateFormat.parse("2023-10-31 00:00:00"))
                && authDate.before(simpleDateFormat.parse("2023-11-11 00:00:00"))) {
            // 条件成立，查询二级审核信息
            date = AuthService.queryAuthInfo("1000012", orderId);
            if (date == null) {
                return new AuthInfo("0001","单号：" + orderId,"状态：等待二级审核负责人进行审批");
            }
        }

        // 一级审批
        // 查询是否存在审核信息，虚拟一级审核人ID：1000011
        // 耳机审核人审核申请单的时间范围: 11-11 ~ 11-31
        if (authDate.after(simpleDateFormat.parse("2023-11-11 00:00:00"))
                && authDate.before(simpleDateFormat.parse("2023-11-31 00:00:00"))) {
            // 条件成立，查询二级审核信息
            date = AuthService.queryAuthInfo("1000011", orderId);
            if (date == null) {
                return new AuthInfo("0001","单号：" + orderId,"状态：等待一级审核负责人进行审批");
            }
        }

        return new AuthInfo("0001","单号："+orderId,"申请人："+name,"状态：审批完成");
    }
}
