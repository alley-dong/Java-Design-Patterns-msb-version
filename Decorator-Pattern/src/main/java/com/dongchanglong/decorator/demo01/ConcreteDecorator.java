package com.dongchanglong.decorator.demo01;

/**
 * 具体装饰者类
 */
public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component) {
        super(component);
    }

    // 重写父类方法
    @Override
    public void operation() {
        // 调用原有的业务方法
        super.operation();
        // 新增的业务方法
        add();
    }

    public void add(){
        System.out.println("插蜡烛");
    }
}
