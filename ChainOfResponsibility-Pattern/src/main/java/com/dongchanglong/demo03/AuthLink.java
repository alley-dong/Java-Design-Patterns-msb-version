package com.dongchanglong.demo03;

import com.dongchanglong.demo02.AuthInfo;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 抽象审核链类
 */
public abstract class AuthLink {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    protected SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    // 审核人ID
    protected String levelUserId;
    // 审核人姓名
    protected String levelUserName;
    // 表示持有下一个处理对象的引用
    protected AuthLink next;

    public AuthLink(String levelUserId, String levelUserName) {
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }

    // 获取下一个处理器
    public AuthLink getNext(){
        return next;
    }

    // 向责任链中添加处理器
    public AuthLink appendNext(AuthLink next){
        this.next = next;
        return this;
    }

    // 抽象审核方法
    public abstract AuthInfo doAuth(String uId, String orderId, Date authDate);

}
