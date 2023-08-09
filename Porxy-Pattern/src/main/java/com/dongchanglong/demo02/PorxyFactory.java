package com.dongchanglong.demo02;

import com.dongchanglong.demo01.IUserDao;
import com.dongchanglong.demo01.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * 代理工厂类-JDK动态的生成代理对象
 * @date 2023/8/8 16:07
 * @author DongCL
 */
public class PorxyFactory {

    // 维护一个目标对象
    private Object target;

    // 对目标对象生成代理对象
    public PorxyFactory(Object target) {
        this.target = target;
    }

    // 使用Proxy获取代理对象
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                // 目标类使用的类加载器
                target.getClass().getClassLoader(),
                // 目标对象实现的接口
                target.getClass().getInterfaces(),
                // 方法执行器，执行被代理对象的目标方法
                new InvocationHandler() {
                    /**
                     * @param proxy 代理对象，给jdk使用，任何时候都不要操作此对象
                     * @param method 对应于代理对象上调用的接口方法实例
                     * @param args 对应代理对象在调用接口方法时传递的实际参数
                     * @return java.lang.Object 目标对象的方法返回值，没有返回值就返回void
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 利用反射执行目标方法,目标方法执行后的返回值
                        Object result = null;
                        try {
                            System.out.println(method.getName()+"方法开始执行，参数是："+ Arrays.asList(args));
                            result = method.invoke(target, args);
                            System.out.println(method.getName()+"方法执行完成，结果是："+ result);
                        } catch (Exception e) {
                            System.out.println(method.getName()+"方法出现异常："+ e.getMessage());
                        } finally {
                            System.out.println(method.getName()+"方法执行结束了......");
                        }
                        //将结果返回回去
                        return result;
                    }
                }
        );
    }
}
