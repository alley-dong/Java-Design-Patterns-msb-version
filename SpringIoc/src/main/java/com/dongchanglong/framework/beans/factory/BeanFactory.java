package com.dongchanglong.framework.beans.factory;

/**
 * IOC容器的父接口
 * @date 2023/11/26 11:26
 * @author DongCL
 */
public interface BeanFactory {
    Object getBean(String name) throws Exception;
    //泛型方法,传入当前类或者其子类
    <T> T getBean(String name ,Class<? extends T> clazz)throws Exception;
}
