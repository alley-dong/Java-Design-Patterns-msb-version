package com.dongchanglong.demo02;

import com.dongchanglong.demo01.Visitor;

/**
 * 接待者接口(抽象元素角色)
 **/
public interface Acceptable {
    //接收所有的Visitor访问者的子类实现类
    public void accept(Visitor visitor);
}