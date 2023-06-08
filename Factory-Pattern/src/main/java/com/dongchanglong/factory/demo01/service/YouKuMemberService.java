package com.dongchanglong.factory.demo01.service;

/**
 * 赠送优酷会员服务
 */
public class YouKuMemberService {
    public void openMember(String bindMobile , String number){
        System.out.println("发放优酷会员: " + bindMobile + " , " + number);
    }
}