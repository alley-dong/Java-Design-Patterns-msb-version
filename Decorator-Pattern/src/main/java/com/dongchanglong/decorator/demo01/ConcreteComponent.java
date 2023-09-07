package com.dongchanglong.decorator.demo01;

/**
 * 具体构件类（被装饰类）
 * @date 2023/8/17 09:51
 * @author DongCL
 */
public class ConcreteComponent extends Component {

    @Override
    public void operation() {
        // 基础功能实现，复杂功能通过装饰类扩展
        System.out.println("这是一个基础蛋糕！");
    }
}
