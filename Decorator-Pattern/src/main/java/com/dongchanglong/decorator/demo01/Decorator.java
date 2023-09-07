package com.dongchanglong.decorator.demo01;

/**
 * 抽象装饰类-装饰者模式的核心
 * @date 2023/8/17 09:53
 * @author DongCL
 */
public class Decorator extends Component {

    // 维持一个对抽象构件的引用
    private Component component;

    // 通过构造注入一个抽象构件类型的对象
    /**
     * 这个地方进行依赖注入 是因为：具体职责在其子类中实现.它维护了一个指向抽象构件对象的引用。
     * 以达装饰作用
     */
    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        // 调用原有的业务方法，并没有真正的进行装饰，而是提供了一个统一的接口
        component.operation();
    }
}
