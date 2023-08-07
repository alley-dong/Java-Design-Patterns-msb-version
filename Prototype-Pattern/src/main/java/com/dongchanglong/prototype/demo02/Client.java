package com.dongchanglong.prototype.demo02;

import java.util.Random;

public class Client {
    //发送信息的是数量,这个值可以从数据库获取
    private static int MAX_COUNT = 6;
    public static void main(String[] args) throws CloneNotSupportedException {
        //模拟邮件发送
        int i = 0;
        //把模板定义出来,数据是从数据库获取的
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("xxx银行版权所有");
        while(i < MAX_COUNT){
            /*
             * 这里考虑邮件发送示例中还包含多线程场景，使用clone方法可以避免出现线程安全问题。
             * 每次复制的都是一个新的对象，不会出现第一个线程没有发送出去，第二个线程进来就将邮件内容修改的问题。
             */
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(" 先生 (女士)");
            Random random = new Random();
            int num = random.nextInt(9999999);
            // 每封邮件发送至不同邮箱
            cloneMail.setReceiver(num+"@"+"liuliuqiu.com");
            // 发送 邮件
            sendMail(cloneMail);
            i++;
        }
    }
    //发送邮件
    public static void sendMail(Mail mail){
        System.out.println("标题: " + mail.getSubject() + "\t收件人: " + mail.getReceiver()
                + "\t..发送成功!");
    }
}