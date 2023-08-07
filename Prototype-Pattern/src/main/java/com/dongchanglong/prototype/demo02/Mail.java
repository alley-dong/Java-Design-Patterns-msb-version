package com.dongchanglong.prototype.demo02;

import lombok.Getter;
import lombok.Setter;

/**
 * 邮件 实现Cloneable接口,表示该类的实例可以被复制
 * @date 2023/8/4 10:01
 * @author DongCL
 */
@Getter
@Setter
public class Mail implements Cloneable{
    //收件人
    private String receiver;
    //邮件名称
    private String subject;
    //称谓
    private String appellation;
    //邮件内容
    private String context;
    //邮件尾部, 一般是"xxx版权所有"等信息
    private String tail;

    //构造函数
    public Mail(AdvTemplate advTemplate) {
        this.context = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }

    @Override
    protected Mail clone() throws CloneNotSupportedException {
        try {
            return (Mail)super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
