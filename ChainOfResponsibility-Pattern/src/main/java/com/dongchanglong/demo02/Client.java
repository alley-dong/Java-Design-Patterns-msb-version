package com.dongchanglong.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    public static void main(String[] args) throws ParseException {
        AuthController authController = new AuthController();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse("2023-11-12 00:00:00");

        // 模拟审核请求及审批操作
        AuthInfo info = authController.doAuth("研发小董", "1000010001000", date);
        System.out.println("当前审核状态："+ info.getInfo());
        AuthService.auth("1000013","1000010001000");
        System.out.println("三级审批负责人 审批完成，审批人：王工");

        AuthInfo info1 = authController.doAuth("研发小猪", "1000010001000", date);
        System.out.println("当前审核状态："+ info1.getInfo());
        AuthService.auth("1000012","1000010001000");
        System.out.println("二级审批负责人 审批完成，审批人：李经历");

        AuthInfo info2 = authController.doAuth("研发小狗", "1000010001000", date);
        System.out.println("当前审核状态："+ info2.getInfo());
        AuthService.auth("1000011","1000010001000");
        System.out.println("一级审批负责人 审批完成，审批人：朱总");
    }
}
