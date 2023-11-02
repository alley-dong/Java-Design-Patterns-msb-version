package com.dongchanglong.demo01;

/**
 * 访问者接口-根据入参不同调用对应的重载方法
 **/
public interface Visitor {
    public void visit(Candy candy);  //糖果重载方法
    public void visit(Wine wine);  //酒类重载方法
    public void visit(Fruit fruit);  //水果重载方法
}