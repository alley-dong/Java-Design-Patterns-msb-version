package com.dongchanglong.dmeo03;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 日志代理类
 * @date 2023/8/9 15:45
 * @author DongCL
 */
public class UserLogProxy implements MethodInterceptor {

    /**
     * 实现回调方法
     * @param o 代理对象
     * @param method 目标对象中的方法的Method实例
     * @param args 实际参数
     * @param methodProxy 代理类对象中的方法的Method实例
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Calendar instance = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 前置操作
        System.out.println(simpleDateFormat.format(instance.getTime()) + "[" + method.getName() + "] 查询用户信息");
        // 调用父类的方法
        Object invokeSuper = methodProxy.invokeSuper(o, args);
        return invokeSuper;
    }


    /**
     * 生成Cglib动态代理类方法
     * @param target 需要被代理的目标类
     * @return 返回代理类对象
     */
    public Object getLogProxy(Object target){
        // 增强器  用于创建动态代理类
        Enhancer enhancer = new Enhancer();
        // 设置代理类的父类字节码对象（设置继承关系）
        enhancer.setSuperclass(target.getClass());
        // 设置回调：传入实现了MethodInterceptor接口的实现类
        // 对于代理类上所有的方法的调用,都会调用CallBack,而Callback则需要实现intercept()方法进行拦截
        enhancer.setCallback(this);
        // 创建动态代理对象 并返回
        return enhancer.create();
    }

}
