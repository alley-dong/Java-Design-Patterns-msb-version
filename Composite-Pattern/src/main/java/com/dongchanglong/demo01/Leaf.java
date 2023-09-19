package com.dongchanglong.demo01;

/**
 * 叶子节点
 *      叶子节点中不能包含子节点
 * @date 2023/9/19 21:37
 * @author DongCL
 */
public class Leaf extends Component {
    @Override
    public void add(Component c) {
        //具体操作
    }
    @Override
    public void remove(Component c) {
        //具体操作
    }
    @Override
    public Component getChild(int i) {
        //具体操作
        return new Leaf();
    }
    @Override
    public void operation() {
        //叶子节点具体业务方法
    }
}