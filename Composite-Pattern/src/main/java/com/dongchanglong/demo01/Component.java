package com.dongchanglong.demo01;

/**
 * 抽象根节点
 *     对于客户端而言将针对抽象编程,无需关心其具体子类是容器构件还是叶子构件。
 * @date 2023/9/19 21:36
 * @author DongCL
 */
public abstract class Component {
    public abstract void add(Component c); //增加成员
    public abstract void remove(Component c); //删除成员
    public abstract Component getChild(int i); //获取成员
    public abstract void operation(); //业务方法
}