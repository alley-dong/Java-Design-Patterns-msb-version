package com.dongchanglong.demo01;

import java.util.ArrayList;

/**
 * 树枝节点
 *      容器对象,可以包含子节点
 * @date 2023/9/19 21:37
 * @author DongCL
 */
public class Composite extends Component {
    // 容器对象 可以包含子节点
    private ArrayList<Component> list = new ArrayList<>();

    @Override
    public void add(Component c) {
        list.add(c);
    }

    @Override
    public void remove(Component c) {
        list.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return (Component) list.get(i);
    }

    @Override
    public void operation() {
        //在树枝节点中的业务方法,将递归调用其他节点中的operation() 方法
        for (Component component : list) {
            component.operation();
        }
    }
}